import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public abstract class Class129 implements Interface1 {

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
	private int anInt9037;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
	private int anInt9038;

	@OriginalMember(owner = "client!tba", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
	private int anInt9030 = 0;

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "I")
	private int anInt9043 = -1;

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "Z")
	private final boolean aBoolean698;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Lclient!hp;")
	protected final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_11;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
	private final int anInt9033;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!hp;IZ)V")
	protected Class129(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean698 = arg2;
		this.aClass134_Sub1_Sub1_11 = arg0;
		this.anInt9033 = arg1;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)I")
	@Override
	public int method7374() {
		return this.anInt9037;
	}

	@OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7384();
		super.finalize();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)V")
	public void method7376(@OriginalArg(1) int arg0) {
		if (this.anInt9038 < arg0) {
			this.method7382();
			if (this.anInt9043 > 0) {
				OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
				OpenGL.glBufferDataARBub(this.anInt9033, arg0, null, 0, this.aBoolean698 ? 35040 : 35044);
				this.aClass134_Sub1_Sub1_11.anInt8423 += arg0 - this.anInt9038;
			} else {
				this.aNativeHeapBuffer8 = this.aClass134_Sub1_Sub1_11.method6758(arg0, false);
			}
			this.anInt9038 = arg0;
		}
		this.anInt9037 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7377(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt9030 == 0) {
			this.method7382();
			if (this.anInt9043 <= 0) {
				this.anInt9030 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
			OpenGL.glBufferDataARBub(this.anInt9033, this.anInt9038, null, 0, this.aBoolean698 ? 35040 : 35044);
			if (this.anInt9037 <= this.aClass134_Sub1_Sub1_11.aNativeHeapBuffer7.d) {
				this.anInt9030 = 1;
				return this.aClass134_Sub1_Sub1_11.aNativeHeapBuffer7;
			}
			if (!arg0.a() && arg0.a(this.anInt9033, this.anInt9037, 35001)) {
				this.anInt9030 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V")
	public final void method7378() {
		if (this.aClass134_Sub1_Sub1_11.aBoolean306) {
			OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method7379(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt9030 != 0) {
			if (this.anInt9043 > 0) {
				OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
				if (this.anInt9030 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9033, 0, this.anInt9038, this.aClass134_Sub1_Sub1_11.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt9030 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)J")
	public final long method7381() {
		return this.anInt9043 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "(I)V")
	private void method7382() {
		if (this.anInt9043 >= 0) {
			return;
		}
		if (this.aClass134_Sub1_Sub1_11.aBoolean306) {
			OpenGL.glGenBuffersARB(1, Static286.anIntArray635, 0);
			this.anInt9043 = Static286.anIntArray635[0];
			OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
		} else {
			this.anInt9043 = 0;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	public void method7384() {
		if (this.anInt9043 > 0) {
			this.aClass134_Sub1_Sub1_11.method3211(this.anInt9043, this.anInt9037);
			this.anInt9043 = -1;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZILclient!jaclib/memory/Source;)Z")
	protected final boolean method7385(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 <= this.anInt9038) {
			if (this.anInt9043 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
			OpenGL.glBufferSubDataARBa(this.anInt9033, 0, this.anInt9037, arg1.getAddress());
			this.aClass134_Sub1_Sub1_11.anInt8423 += arg0 - this.anInt9037;
		} else {
			this.method7382();
			if (this.anInt9043 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9033, this.anInt9043);
			OpenGL.glBufferDataARBa(this.anInt9033, arg0, arg1.getAddress(), this.aBoolean698 ? 35040 : 35044);
			this.aClass134_Sub1_Sub1_11.anInt8423 += arg0 - this.anInt9037;
			this.anInt9038 = arg0;
		}
		this.anInt9037 = arg0;
		return true;
	}
}
