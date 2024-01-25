import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public abstract class Class233 implements Interface4 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private int anInt7456;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	private int anInt7461;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
	private int anInt7469 = 0;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
	private int anInt7465 = -1;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!sha;")
	protected final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_10;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
	private final int anInt7464;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!sha;IZ)V")
	protected Class233(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean531 = arg2;
		this.aClass95_Sub1_Sub1_10 = arg0;
		this.anInt7464 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method7408(@OriginalArg(1) int arg0) {
		if (this.anInt7456 < arg0) {
			this.method6257();
			if (this.anInt7465 <= 0) {
				this.aNativeHeapBuffer5 = this.aClass95_Sub1_Sub1_10.method8074(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
				OpenGL.glBufferDataARBub(this.anInt7464, arg0, (byte[]) null, 0, this.aBoolean531 ? 35040 : 35044);
				this.aClass95_Sub1_Sub1_10.anInt10019 += arg0 - this.anInt7456;
			}
			this.anInt7456 = arg0;
		}
		this.anInt7461 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public final void method6254() {
		if (this.aClass95_Sub1_Sub1_10.aBoolean621) {
			OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
	@Override
	public int method7404() {
		return this.anInt7461;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6255(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt7469 == 0) {
			this.method6257();
			if (this.anInt7465 <= 0) {
				this.anInt7469 = 2;
				return this.aNativeHeapBuffer5;
			}
			OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
			OpenGL.glBufferDataARBub(this.anInt7464, this.anInt7456, (byte[]) null, 0, this.aBoolean531 ? 35040 : 35044);
			if (this.aClass95_Sub1_Sub1_10.aNativeHeapBuffer8.d >= this.anInt7461) {
				this.anInt7469 = 1;
				return this.aClass95_Sub1_Sub1_10.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt7464, this.anInt7461, 35001)) {
				this.anInt7469 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7409();
		super.finalize();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	private void method6257() {
		if (this.anInt7465 >= 0) {
			return;
		}
		if (this.aClass95_Sub1_Sub1_10.aBoolean621) {
			OpenGL.glGenBuffersARB(1, Static663.anIntArray590, 0);
			this.anInt7465 = Static663.anIntArray590[0];
			OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
		} else {
			this.anInt7465 = 0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	public void method7409() {
		if (this.anInt7465 > 0) {
			this.aClass95_Sub1_Sub1_10.method7303(this.anInt7461, this.anInt7465);
			this.anInt7465 = -1;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)J")
	public final long method6259() {
		return this.anInt7465 == 0 ? this.aNativeHeapBuffer5.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;Z)Z")
	protected final boolean method6260(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7469 != 0) {
			if (this.anInt7465 > 0) {
				OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
				if (this.anInt7469 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7464, 0, this.anInt7456, this.aClass95_Sub1_Sub1_10.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt7469 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method6261(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt7456) {
			this.method6257();
			if (this.anInt7465 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
			OpenGL.glBufferDataARBa(this.anInt7464, arg1, arg0.getAddress(), this.aBoolean531 ? 35040 : 35044);
			this.aClass95_Sub1_Sub1_10.anInt10019 += arg1 - this.anInt7461;
			this.anInt7456 = arg1;
		} else if (this.anInt7465 > 0) {
			OpenGL.glBindBufferARB(this.anInt7464, this.anInt7465);
			OpenGL.glBufferSubDataARBa(this.anInt7464, 0, this.anInt7461, arg0.getAddress());
			this.aClass95_Sub1_Sub1_10.anInt10019 += arg1 - this.anInt7461;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7461 = arg1;
		return true;
	}
}
