import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ska")
public abstract class Class168 implements Interface18 {

	@OriginalMember(owner = "client!ska", name = "u", descriptor = "I")
	private int anInt7864;

	@OriginalMember(owner = "client!ska", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!ska", name = "k", descriptor = "I")
	private int anInt7873;

	@OriginalMember(owner = "client!ska", name = "e", descriptor = "I")
	private int anInt7863 = -1;

	@OriginalMember(owner = "client!ska", name = "f", descriptor = "I")
	private int anInt7872 = 0;

	@OriginalMember(owner = "client!ska", name = "v", descriptor = "Lclient!vaa;")
	protected final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_10;

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "I")
	private final int anInt7875;

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "Z")
	private final boolean aBoolean528;

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(Lclient!vaa;IZ)V")
	protected Class168(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass22_Sub2_Sub2_10 = arg0;
		this.anInt7875 = arg1;
		this.aBoolean528 = arg2;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method6753(@OriginalArg(1) MapBuffer arg0) {
		@Pc(13) boolean local13 = true;
		if (this.anInt7872 != 0) {
			if (this.anInt7863 > 0) {
				OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
				if (this.anInt7872 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7875, 0, this.anInt7864, this.aClass22_Sub2_Sub2_10.aNativeHeapBuffer8.getAddress());
				} else {
					local13 = arg0.b();
				}
			}
			this.anInt7872 = 0;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(I)V")
	public void method6754() {
		if (this.anInt7863 > 0) {
			this.aClass22_Sub2_Sub2_10.method8984(this.anInt7873, this.anInt7863);
			this.anInt7863 = -1;
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZB)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6756(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt7872 == 0) {
			this.method6758();
			if (this.anInt7863 <= 0) {
				this.anInt7872 = 2;
				return this.aNativeHeapBuffer4;
			}
			OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
			OpenGL.glBufferDataARBub(this.anInt7875, this.anInt7864, (byte[]) null, 0, this.aBoolean528 ? 35040 : 35044);
			if (this.aClass22_Sub2_Sub2_10.aNativeHeapBuffer8.a >= this.anInt7873) {
				this.anInt7872 = 1;
				return this.aClass22_Sub2_Sub2_10.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt7875, this.anInt7873, 35001)) {
				this.anInt7872 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(II)V")
	public void method6757(@OriginalArg(0) int arg0) {
		if (this.anInt7864 < arg0) {
			this.method6758();
			if (this.anInt7863 <= 0) {
				this.aNativeHeapBuffer4 = this.aClass22_Sub2_Sub2_10.method8963(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
				OpenGL.glBufferDataARBub(this.anInt7875, arg0, (byte[]) null, 0, this.aBoolean528 ? 35040 : 35044);
				this.aClass22_Sub2_Sub2_10.anInt10452 += arg0 - this.anInt7864;
			}
			this.anInt7864 = arg0;
		}
		this.anInt7873 = arg0;
	}

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "(I)I")
	@Override
	public int method6752() {
		return this.anInt7873;
	}

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "(Z)V")
	private void method6758() {
		if (this.anInt7863 >= 0) {
			return;
		}
		if (this.aClass22_Sub2_Sub2_10.aBoolean714) {
			OpenGL.glGenBuffersARB(1, Static631.anIntArray703, 0);
			this.anInt7863 = Static631.anIntArray703[0];
			OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
		} else {
			this.anInt7863 = 0;
		}
	}

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "(B)V")
	public final void method6759() {
		if (this.aClass22_Sub2_Sub2_10.aBoolean714) {
			OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
		}
	}

	@OriginalMember(owner = "client!ska", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6754();
		super.finalize();
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BI)Z")
	protected final boolean method6762(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt7864) {
			this.method6758();
			if (this.anInt7863 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
			OpenGL.glBufferDataARBa(this.anInt7875, arg1, arg0.getAddress(), this.aBoolean528 ? 35040 : 35044);
			this.aClass22_Sub2_Sub2_10.anInt10452 += arg1 - this.anInt7873;
			this.anInt7864 = arg1;
		} else if (this.anInt7863 > 0) {
			OpenGL.glBindBufferARB(this.anInt7875, this.anInt7863);
			OpenGL.glBufferSubDataARBa(this.anInt7875, 0, this.anInt7873, arg0.getAddress());
			this.aClass22_Sub2_Sub2_10.anInt10452 += arg1 - this.anInt7873;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7873 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ska", name = "e", descriptor = "(I)J")
	public final long method6763() {
		return this.anInt7863 == 0 ? this.aNativeHeapBuffer4.getAddress() : 0L;
	}
}
