import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public abstract class Class237 implements Interface16 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	private int anInt10540;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	private int anInt10543;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	private int anInt10541 = -1;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	private int anInt10552 = 0;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	private final int anInt10555;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!fc;")
	protected final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_11;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "Z")
	private final boolean aBoolean771;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!fc;IZ)V")
	protected Class237(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt10555 = arg1;
		this.aClass101_Sub1_Sub1_11 = arg0;
		this.aBoolean771 = arg2;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public void method9031(@OriginalArg(1) int arg0) {
		if (this.anInt10540 < arg0) {
			this.method9036();
			if (this.anInt10541 > 0) {
				OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
				OpenGL.glBufferDataARBub(this.anInt10555, arg0, (byte[]) null, 0, this.aBoolean771 ? 35040 : 35044);
				this.aClass101_Sub1_Sub1_11.anInt6611 += arg0 - this.anInt10540;
			} else {
				this.aNativeHeapBuffer8 = this.aClass101_Sub1_Sub1_11.method5928(false, arg0);
			}
			this.anInt10540 = arg0;
		}
		this.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZILclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method9032(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt10552 == 0) {
			this.method9036();
			if (this.anInt10541 <= 0) {
				this.anInt10552 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
			OpenGL.glBufferDataARBub(this.anInt10555, this.anInt10540, (byte[]) null, 0, this.aBoolean771 ? 35040 : 35044);
			if (this.anInt10543 <= this.aClass101_Sub1_Sub1_11.aNativeHeapBuffer5.c) {
				this.anInt10552 = 1;
				return this.aClass101_Sub1_Sub1_11.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt10555, this.anInt10543, 35001)) {
				this.anInt10552 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;)Z")
	protected final boolean method9033(@OriginalArg(1) MapBuffer arg0) {
		@Pc(11) boolean local11 = true;
		if (this.anInt10552 != 0) {
			if (this.anInt10541 > 0) {
				OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
				if (this.anInt10552 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt10555, 0, this.anInt10540, this.aClass101_Sub1_Sub1_11.aNativeHeapBuffer5.getAddress());
				} else {
					local11 = arg0.b();
				}
			}
			this.anInt10552 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)J")
	public final long method9035() {
		return this.anInt10541 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	@Override
	public int method9028() {
		return this.anInt10543;
	}

	@OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9037();
		super.finalize();
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)V")
	private void method9036() {
		if (this.anInt10541 >= 0) {
			return;
		}
		if (this.aClass101_Sub1_Sub1_11.aBoolean251) {
			OpenGL.glGenBuffersARB(1, Static230.anIntArray213, 0);
			this.anInt10541 = Static230.anIntArray213[0];
			OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
		} else {
			this.anInt10541 = 0;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public void method9037() {
		if (this.anInt10541 > 0) {
			this.aClass101_Sub1_Sub1_11.method3144(this.anInt10543, this.anInt10541);
			this.anInt10541 = -1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "(B)V")
	public final void method9038() {
		if (this.aClass101_Sub1_Sub1_11.aBoolean251) {
			OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method9039(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt10540) {
			this.method9036();
			if (this.anInt10541 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
			OpenGL.glBufferDataARBa(this.anInt10555, arg0, arg1.getAddress(), this.aBoolean771 ? 35040 : 35044);
			this.aClass101_Sub1_Sub1_11.anInt6611 += arg0 - this.anInt10543;
			this.anInt10540 = arg0;
		} else if (this.anInt10541 > 0) {
			OpenGL.glBindBufferARB(this.anInt10555, this.anInt10541);
			OpenGL.glBufferSubDataARBa(this.anInt10555, 0, this.anInt10543, arg1.getAddress());
			this.aClass101_Sub1_Sub1_11.anInt6611 += arg0 - this.anInt10543;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt10543 = arg0;
		return true;
	}
}
