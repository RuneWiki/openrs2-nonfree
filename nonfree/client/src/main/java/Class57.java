import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public abstract class Class57 implements Interface9 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	private int anInt9082;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private int anInt9085;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	private int anInt9086 = -1;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	private int anInt9098 = 0;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!og;")
	protected final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_11;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	private final int anInt9088;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!og;IZ)V")
	protected Class57(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass143_Sub1_Sub2_11 = arg0;
		this.aBoolean654 = arg2;
		this.anInt9088 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method7641(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (this.anInt9085 < arg0) {
			this.method7650();
			if (this.anInt9086 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
			OpenGL.glBufferDataARBa(this.anInt9088, arg0, arg1.getAddress(), this.aBoolean654 ? 35040 : 35044);
			this.aClass143_Sub1_Sub2_11.anInt7363 += arg0 - this.anInt9082;
			this.anInt9085 = arg0;
		} else if (this.anInt9086 > 0) {
			OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
			OpenGL.glBufferSubDataARBa(this.anInt9088, 0, this.anInt9082, arg1.getAddress());
			this.aClass143_Sub1_Sub2_11.anInt7363 += arg0 - this.anInt9082;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9082 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;)Z")
	protected final boolean method7642(@OriginalArg(1) MapBuffer arg0) {
		@Pc(12) boolean local12 = true;
		if (this.anInt9098 != 0) {
			if (this.anInt9086 > 0) {
				OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
				if (this.anInt9098 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9088, 0, this.anInt9085, this.aClass143_Sub1_Sub2_11.aNativeHeapBuffer7.getAddress());
				} else {
					local12 = arg0.a();
				}
			}
			this.anInt9098 = 0;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZB)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7643(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt9098 == 0) {
			this.method7650();
			if (this.anInt9086 <= 0) {
				this.anInt9098 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
			OpenGL.glBufferDataARBub(this.anInt9088, this.anInt9085, (byte[]) null, 0, this.aBoolean654 ? 35040 : 35044);
			if (this.aClass143_Sub1_Sub2_11.aNativeHeapBuffer7.c >= this.anInt9082) {
				this.anInt9098 = 1;
				return this.aClass143_Sub1_Sub2_11.aNativeHeapBuffer7;
			}
			if (!arg0.b() && arg0.a(this.anInt9088, this.anInt9082, 35001)) {
				this.anInt9098 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I")
	@Override
	public int method7861() {
		return this.anInt9082;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
	public void method7863(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt9085) {
			this.method7650();
			if (this.anInt9086 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass143_Sub1_Sub2_11.method6343(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
				OpenGL.glBufferDataARBub(this.anInt9088, arg0, (byte[]) null, 0, this.aBoolean654 ? 35040 : 35044);
				this.aClass143_Sub1_Sub2_11.anInt7363 += arg0 - this.anInt9085;
			}
			this.anInt9085 = arg0;
		}
		this.anInt9082 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)J")
	public final long method7648() {
		return this.anInt9086 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public void method7866() {
		if (this.anInt9086 > 0) {
			this.aClass143_Sub1_Sub2_11.method6412(this.anInt9086, this.anInt9082);
			this.anInt9086 = -1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7866();
		super.finalize();
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V")
	private void method7650() {
		if (this.anInt9086 >= 0) {
			return;
		}
		if (this.aClass143_Sub1_Sub2_11.aBoolean546) {
			OpenGL.glGenBuffersARB(1, Static550.anIntArray492, 0);
			this.anInt9086 = Static550.anIntArray492[0];
			OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
		} else {
			this.anInt9086 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	public final void method7652() {
		if (this.aClass143_Sub1_Sub2_11.aBoolean546) {
			OpenGL.glBindBufferARB(this.anInt9088, this.anInt9086);
		}
	}
}
