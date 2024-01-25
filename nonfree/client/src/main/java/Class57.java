import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public abstract class Class57 implements Interface6 {

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "[J")
	public static final long[] aLongArray22 = new long[256];

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	private int anInt9133;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	private int anInt9139;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	private int anInt9145 = -1;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	private int anInt9141 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	private final int anInt9127;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!pi;")
	private final Class42_Sub1_Sub2 aClass42_Sub1_Sub2_10;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(14) long local14 = (long) local10;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray22[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pi;IZ)V")
	protected Class57(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt9127 = arg1;
		this.aBoolean651 = arg2;
		this.aClass42_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method7529(@OriginalArg(1) int arg0) {
		if (this.anInt9139 < arg0) {
			this.method7537();
			if (this.anInt9145 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass42_Sub1_Sub2_10.method5908(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
				OpenGL.glBufferDataARBub(this.anInt9127, arg0, null, 0, this.aBoolean651 ? 35040 : 35044);
				this.aClass42_Sub1_Sub2_10.anInt7096 += arg0 - this.anInt9139;
			}
			this.anInt9139 = arg0;
		}
		this.anInt9133 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public final void method7530() {
		if (this.aClass42_Sub1_Sub2_10.aBoolean518) {
			OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
		}
	}

	@OriginalMember(owner = "client!cn", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7898();
		super.finalize();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method7898() {
		if (this.anInt9145 > 0) {
			this.aClass42_Sub1_Sub2_10.method6001(this.anInt9133, this.anInt9145);
			this.anInt9145 = -1;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
	@Override
	public int method7894() {
		return this.anInt9133;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	public Buffer method7895() {
		if (this.anInt9141 == 0) {
			this.method7537();
			if (this.anInt9145 <= 0) {
				this.anInt9141 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
			OpenGL.glBufferDataARBub(this.anInt9127, this.anInt9139, null, 0, this.aBoolean651 ? 35040 : 35044);
			if (this.aClass42_Sub1_Sub2_10.aNativeHeapBuffer5.a >= this.anInt9133) {
				this.anInt9141 = 1;
				return this.aClass42_Sub1_Sub2_10.aNativeHeapBuffer5;
			}
			@Pc(68) MapBuffer local68 = this.aClass42_Sub1_Sub2_10.aMapBuffer1;
			if (!local68.a() && local68.a(this.anInt9127, this.anInt9133, 35001)) {
				this.anInt9141 = 2;
				return local68;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)Z")
	public boolean method7899() {
		@Pc(10) boolean local10 = true;
		if (this.anInt9141 != 0) {
			if (this.anInt9145 > 0) {
				OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
				if (this.anInt9141 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9127, 0, this.anInt9139, this.aClass42_Sub1_Sub2_10.aNativeHeapBuffer5.getAddress());
				} else {
					local10 = this.aClass42_Sub1_Sub2_10.aMapBuffer1.b();
				}
			}
			this.anInt9141 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method7536(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt9139) {
			this.method7537();
			if (this.anInt9145 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
			OpenGL.glBufferDataARBa(this.anInt9127, arg0, arg1.getAddress(), this.aBoolean651 ? 35040 : 35044);
			this.aClass42_Sub1_Sub2_10.anInt7096 += arg0 - this.anInt9133;
			this.anInt9139 = arg0;
		} else if (this.anInt9145 > 0) {
			OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
			OpenGL.glBufferSubDataARBa(this.anInt9127, 0, this.anInt9133, arg1.getAddress());
			this.aClass42_Sub1_Sub2_10.anInt7096 += arg0 - this.anInt9133;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9133 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
	private void method7537() {
		if (this.anInt9145 >= 0) {
			return;
		}
		if (this.aClass42_Sub1_Sub2_10.aBoolean518) {
			OpenGL.glGenBuffersARB(1, Static337.anIntArray448, 0);
			this.anInt9145 = Static337.anIntArray448[0];
			OpenGL.glBindBufferARB(this.anInt9127, this.anInt9145);
		} else {
			this.anInt9145 = 0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)J")
	public final long method7538() {
		return this.anInt9145 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}
}
