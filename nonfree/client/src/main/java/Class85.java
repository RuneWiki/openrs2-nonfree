import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public abstract class Class85 implements Interface4 {

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	private int anInt6405;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "I")
	private int anInt6409;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	private int anInt6403 = -1;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	private int anInt6412 = 0;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!kd;")
	protected final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_7;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	private final int anInt6404;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
	private final boolean aBoolean505;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!kd;IZ)V")
	protected Class85(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass162_Sub1_Sub2_7 = arg0;
		this.anInt6404 = arg1;
		this.aBoolean505 = arg2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)I")
	@Override
	public int method7030() {
		return this.anInt6405;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method5356(@OriginalArg(0) MapBuffer arg0) {
		@Pc(12) boolean local12 = true;
		if (this.anInt6412 != 0) {
			if (this.anInt6403 > 0) {
				OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
				if (this.anInt6412 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6404, 0, this.anInt6409, this.aClass162_Sub1_Sub2_7.aNativeHeapBuffer6.getAddress());
				} else {
					local12 = arg0.a();
				}
			}
			this.anInt6412 = 0;
		}
		return local12;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	private void method5357() {
		if (this.anInt6403 >= 0) {
			return;
		}
		if (this.aClass162_Sub1_Sub2_7.aBoolean361) {
			OpenGL.glGenBuffersARB(1, Static492.anIntArray521, 0);
			this.anInt6403 = Static492.anIntArray521[0];
			OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
		} else {
			this.anInt6403 = 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public void method7032() {
		if (this.anInt6403 > 0) {
			this.aClass162_Sub1_Sub2_7.method3966(this.anInt6405, this.anInt6403);
			this.anInt6403 = -1;
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)J")
	public final long method5359() {
		return this.anInt6403 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	public final void method5360() {
		if (this.aClass162_Sub1_Sub2_7.aBoolean361) {
			OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
		}
	}

	@OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7032();
		super.finalize();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZB)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5362(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt6412 == 0) {
			this.method5357();
			if (this.anInt6403 <= 0) {
				this.anInt6412 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
			OpenGL.glBufferDataARBub(this.anInt6404, this.anInt6409, null, 0, this.aBoolean505 ? 35040 : 35044);
			if (this.aClass162_Sub1_Sub2_7.aNativeHeapBuffer6.a >= this.anInt6405) {
				this.anInt6412 = 1;
				return this.aClass162_Sub1_Sub2_7.aNativeHeapBuffer6;
			}
			if (!arg0.b() && arg0.a(this.anInt6404, this.anInt6405, 35001)) {
				this.anInt6412 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public void method7035(@OriginalArg(0) int arg0) {
		if (this.anInt6409 < arg0) {
			this.method5357();
			if (this.anInt6403 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass162_Sub1_Sub2_7.method3839(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
				OpenGL.glBufferDataARBub(this.anInt6404, arg0, null, 0, this.aBoolean505 ? 35040 : 35044);
				this.aClass162_Sub1_Sub2_7.anInt4577 += arg0 - this.anInt6409;
			}
			this.anInt6409 = arg0;
		}
		this.anInt6405 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IZ)Z")
	protected final boolean method5364(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6409 < arg1) {
			this.method5357();
			if (this.anInt6403 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
			OpenGL.glBufferDataARBa(this.anInt6404, arg1, arg0.getAddress(), this.aBoolean505 ? 35040 : 35044);
			this.aClass162_Sub1_Sub2_7.anInt4577 += arg1 - this.anInt6405;
			this.anInt6409 = arg1;
		} else if (this.anInt6403 > 0) {
			OpenGL.glBindBufferARB(this.anInt6404, this.anInt6403);
			OpenGL.glBufferSubDataARBa(this.anInt6404, 0, this.anInt6405, arg0.getAddress());
			this.aClass162_Sub1_Sub2_7.anInt4577 += arg1 - this.anInt6405;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt6405 = arg1;
		return true;
	}
}
