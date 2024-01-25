import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public abstract class Class53 implements Interface23 {

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	private int anInt9105;

	@OriginalMember(owner = "client!cca", name = "x", descriptor = "I")
	private int anInt9119;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
	private int anInt9108 = -1;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
	private int anInt9109 = 0;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "Lclient!oia;")
	protected final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_10;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
	private final int anInt9114;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!oia;IZ)V")
	protected Class53(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean679 = arg2;
		this.aClass16_Sub1_Sub2_10 = arg0;
		this.anInt9114 = arg1;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)J")
	public final long method7728() {
		return this.anInt9108 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!cca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7731();
		super.finalize();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;BZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7729(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt9109 == 0) {
			this.method7737();
			if (this.anInt9108 <= 0) {
				this.anInt9109 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
			OpenGL.glBufferDataARBub(this.anInt9114, this.anInt9105, (byte[]) null, 0, this.aBoolean679 ? 35040 : 35044);
			if (this.aClass16_Sub1_Sub2_10.aNativeHeapBuffer7.d >= this.anInt9119) {
				this.anInt9109 = 1;
				return this.aClass16_Sub1_Sub2_10.aNativeHeapBuffer7;
			}
			if (!arg0.b() && arg0.a(this.anInt9114, this.anInt9119, 35001)) {
				this.anInt9109 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	public void method7731() {
		if (this.anInt9108 > 0) {
			this.aClass16_Sub1_Sub2_10.method6330(this.anInt9119, this.anInt9108);
			this.anInt9108 = -1;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt9105) {
			this.method7737();
			if (this.anInt9108 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
			OpenGL.glBufferDataARBa(this.anInt9114, arg0, arg1.getAddress(), this.aBoolean679 ? 35040 : 35044);
			this.aClass16_Sub1_Sub2_10.anInt7432 += arg0 - this.anInt9119;
			this.anInt9105 = arg0;
		} else if (this.anInt9108 > 0) {
			OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
			OpenGL.glBufferSubDataARBa(this.anInt9114, 0, this.anInt9119, arg1.getAddress());
			this.aClass16_Sub1_Sub2_10.anInt7432 += arg0 - this.anInt9119;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9119 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public final void method7733() {
		if (this.aClass16_Sub1_Sub2_10.aBoolean577) {
			OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	public void method7734(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt9105) {
			this.method7737();
			if (this.anInt9108 > 0) {
				OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
				OpenGL.glBufferDataARBub(this.anInt9114, arg0, (byte[]) null, 0, this.aBoolean679 ? 35040 : 35044);
				this.aClass16_Sub1_Sub2_10.anInt7432 += arg0 - this.anInt9105;
			} else {
				this.aNativeHeapBuffer8 = this.aClass16_Sub1_Sub2_10.method6315(arg0, false);
			}
			this.anInt9105 = arg0;
		}
		this.anInt9119 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;B)Z")
	protected final boolean method7736(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt9109 != 0) {
			if (this.anInt9108 > 0) {
				OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
				if (this.anInt9109 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9114, 0, this.anInt9105, this.aClass16_Sub1_Sub2_10.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt9109 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)V")
	private void method7737() {
		if (this.anInt9108 >= 0) {
			return;
		}
		if (this.aClass16_Sub1_Sub2_10.aBoolean577) {
			OpenGL.glGenBuffersARB(1, Static269.anIntArray335, 0);
			this.anInt9108 = Static269.anIntArray335[0];
			OpenGL.glBindBufferARB(this.anInt9114, this.anInt9108);
		} else {
			this.anInt9108 = 0;
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)I")
	@Override
	public int method7727() {
		return this.anInt9119;
	}
}
