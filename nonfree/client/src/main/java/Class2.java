import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public abstract class Class2 implements Interface5 {

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "[J")
	public static final long[] aLongArray28 = new long[256];

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	private int anInt9927;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
	private int anInt9939;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	private int anInt9930 = 0;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
	private int anInt9935 = -1;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
	private final int anInt9937;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!pa;")
	protected final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_12;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Z")
	private final boolean aBoolean759;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray28[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!pa;IZ)V")
	protected Class2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt9937 = arg1;
		this.aClass13_Sub1_Sub1_12 = arg0;
		this.aBoolean759 = arg2;
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)V")
	public final void method8735() {
		if (this.aClass13_Sub1_Sub1_12.aBoolean544) {
			OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)V")
	private void method8736() {
		if (this.anInt9935 >= 0) {
			return;
		}
		if (this.aClass13_Sub1_Sub1_12.aBoolean544) {
			OpenGL.glGenBuffersARB(1, Static291.anIntArray443, 0);
			this.anInt9935 = Static291.anIntArray443[0];
			OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
		} else {
			this.anInt9935 = 0;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.anInt9927;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public void method8737() {
		if (this.anInt9935 > 0) {
			this.aClass13_Sub1_Sub1_12.method6532(this.anInt9935, this.anInt9927);
			this.anInt9935 = -1;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method8738(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt9939) {
			if (this.anInt9935 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
			OpenGL.glBufferSubDataARBa(this.anInt9937, 0, this.anInt9927, arg1.getAddress());
			this.aClass13_Sub1_Sub1_12.anInt8591 += arg0 - this.anInt9927;
		} else {
			this.method8736();
			if (this.anInt9935 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
			OpenGL.glBufferDataARBa(this.anInt9937, arg0, arg1.getAddress(), this.aBoolean759 ? 35040 : 35044);
			this.aClass13_Sub1_Sub1_12.anInt8591 += arg0 - this.anInt9927;
			this.anInt9939 = arg0;
		}
		this.anInt9927 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V")
	public void method8740(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt9939) {
			this.method8736();
			if (this.anInt9935 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass13_Sub1_Sub1_12.method7466(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
				OpenGL.glBufferDataARBub(this.anInt9937, arg0, (byte[]) null, 0, this.aBoolean759 ? 35040 : 35044);
				this.aClass13_Sub1_Sub1_12.anInt8591 += arg0 - this.anInt9939;
			}
			this.anInt9939 = arg0;
		}
		this.anInt9927 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZI)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8741(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt9930 == 0) {
			this.method8736();
			if (this.anInt9935 <= 0) {
				this.anInt9930 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
			OpenGL.glBufferDataARBub(this.anInt9937, this.anInt9939, (byte[]) null, 0, this.aBoolean759 ? 35040 : 35044);
			if (this.aClass13_Sub1_Sub1_12.aNativeHeapBuffer7.d >= this.anInt9927) {
				this.anInt9930 = 1;
				return this.aClass13_Sub1_Sub1_12.aNativeHeapBuffer7;
			}
			if (!arg0.a() && arg0.a(this.anInt9937, this.anInt9927, 35001)) {
				this.anInt9930 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;)Z")
	protected final boolean method8742(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt9930 != 0) {
			if (this.anInt9935 > 0) {
				OpenGL.glBindBufferARB(this.anInt9937, this.anInt9935);
				if (this.anInt9930 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9937, 0, this.anInt9939, this.aClass13_Sub1_Sub1_12.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt9930 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8737();
		super.finalize();
	}

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)J")
	public final long method8743() {
		return this.anInt9935 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}
}
