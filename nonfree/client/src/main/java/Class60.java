import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public abstract class Class60 implements Interface13 {

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "[J")
	public static final long[] aLongArray16 = new long[256];

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	private int anInt8795;

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
	private int anInt8797;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	private int anInt8789 = 0;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
	private int anInt8791 = -1;

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
	private final int anInt8796;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!hj;")
	protected final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_9;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
	private final boolean aBoolean653;

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
			aLongArray16[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!hj;IZ)V")
	protected Class60(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt8796 = arg1;
		this.aClass82_Sub3_Sub1_9 = arg0;
		this.aBoolean653 = arg2;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7562(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt8789 == 0) {
			this.method7569();
			if (this.anInt8791 <= 0) {
				this.anInt8789 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
			OpenGL.glBufferDataARBub(this.anInt8796, this.anInt8797, (byte[]) null, 0, this.aBoolean653 ? 35040 : 35044);
			if (this.anInt8795 <= this.aClass82_Sub3_Sub1_9.aNativeHeapBuffer6.a) {
				this.anInt8789 = 1;
				return this.aClass82_Sub3_Sub1_9.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt8796, this.anInt8795, 35001)) {
				this.anInt8789 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZI)V")
	public void method7563(@OriginalArg(1) int arg0) {
		if (this.anInt8797 < arg0) {
			this.method7569();
			if (this.anInt8791 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass82_Sub3_Sub1_9.method5004(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
				OpenGL.glBufferDataARBub(this.anInt8796, arg0, (byte[]) null, 0, this.aBoolean653 ? 35040 : 35044);
				this.aClass82_Sub3_Sub1_9.anInt5820 += arg0 - this.anInt8797;
			}
			this.anInt8797 = arg0;
		}
		this.anInt8795 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBLclient!jaclib/memory/Source;)Z")
	protected final boolean method7566(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 <= this.anInt8797) {
			if (this.anInt8791 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
			OpenGL.glBufferSubDataARBa(this.anInt8796, 0, this.anInt8795, arg1.getAddress());
			this.aClass82_Sub3_Sub1_9.anInt5820 += arg0 - this.anInt8795;
		} else {
			this.method7569();
			if (this.anInt8791 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
			OpenGL.glBufferDataARBa(this.anInt8796, arg0, arg1.getAddress(), this.aBoolean653 ? 35040 : 35044);
			this.aClass82_Sub3_Sub1_9.anInt5820 += arg0 - this.anInt8795;
			this.anInt8797 = arg0;
		}
		this.anInt8795 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!lfa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7572();
		super.finalize();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;Z)Z")
	protected final boolean method7567(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt8789 != 0) {
			if (this.anInt8791 > 0) {
				OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
				if (this.anInt8789 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8796, 0, this.anInt8797, this.aClass82_Sub3_Sub1_9.aNativeHeapBuffer6.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt8789 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)V")
	public final void method7568() {
		if (this.aClass82_Sub3_Sub1_9.aBoolean326) {
			OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V")
	private void method7569() {
		if (this.anInt8791 >= 0) {
			return;
		}
		if (this.aClass82_Sub3_Sub1_9.aBoolean326) {
			OpenGL.glGenBuffersARB(1, Static78.anIntArray109, 0);
			this.anInt8791 = Static78.anIntArray109[0];
			OpenGL.glBindBufferARB(this.anInt8796, this.anInt8791);
		} else {
			this.anInt8791 = 0;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.anInt8795;
	}

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "(I)J")
	public final long method7570() {
		return this.anInt8791 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public void method7572() {
		if (this.anInt8791 > 0) {
			this.aClass82_Sub3_Sub1_9.method3754(this.anInt8791, this.anInt8795);
			this.anInt8791 = -1;
		}
	}
}
