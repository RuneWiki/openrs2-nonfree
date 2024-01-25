import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public abstract class Class185 implements Interface6 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
	private int anInt8865;

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
	private int anInt8867;

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
	private int anInt8862 = 0;

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
	private int anInt8863 = -1;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
	private final int anInt8857;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lclient!mba;")
	protected final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_12;

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "Z")
	private final boolean aBoolean631;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!mba;IZ)V")
	protected Class185(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt8857 = arg1;
		this.aClass5_Sub1_Sub2_12 = arg0;
		this.aBoolean631 = arg2;
	}

	@OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7982();
		super.finalize();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZILclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7644(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt8862 == 0) {
			this.method7647();
			if (this.anInt8863 <= 0) {
				this.anInt8862 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
			OpenGL.glBufferDataARBub(this.anInt8857, this.anInt8867, null, 0, this.aBoolean631 ? 35040 : 35044);
			if (this.aClass5_Sub1_Sub2_12.aNativeHeapBuffer5.d >= this.anInt8865) {
				this.anInt8862 = 1;
				return this.aClass5_Sub1_Sub2_12.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt8857, this.anInt8865, 35001)) {
				this.anInt8862 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!jaclib/memory/Source;I)Z")
	protected final boolean method7645(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt8867) {
			this.method7647();
			if (this.anInt8863 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
			OpenGL.glBufferDataARBa(this.anInt8857, arg1, arg0.getAddress(), this.aBoolean631 ? 35040 : 35044);
			this.aClass5_Sub1_Sub2_12.anInt6497 += arg1 - this.anInt8865;
			this.anInt8867 = arg1;
		} else if (this.anInt8863 > 0) {
			OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
			OpenGL.glBufferSubDataARBa(this.anInt8857, 0, this.anInt8865, arg0.getAddress());
			this.aClass5_Sub1_Sub2_12.anInt6497 += arg1 - this.anInt8865;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt8865 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	public final void method7646() {
		if (this.aClass5_Sub1_Sub2_12.aBoolean482) {
			OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)V")
	private void method7647() {
		if (this.anInt8863 >= 0) {
			return;
		}
		if (this.aClass5_Sub1_Sub2_12.aBoolean482) {
			OpenGL.glGenBuffersARB(1, Static237.anIntArray234, 0);
			this.anInt8863 = Static237.anIntArray234[0];
			OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
		} else {
			this.anInt8863 = 0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7980() {
		return this.anInt8865;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)V")
	public void method7981(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt8867) {
			this.method7647();
			if (this.anInt8863 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass5_Sub1_Sub2_12.method5663(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
				OpenGL.glBufferDataARBub(this.anInt8857, arg0, null, 0, this.aBoolean631 ? 35040 : 35044);
				this.aClass5_Sub1_Sub2_12.anInt6497 += arg0 - this.anInt8867;
			}
			this.anInt8867 = arg0;
		}
		this.anInt8865 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	public void method7982() {
		if (this.anInt8863 > 0) {
			this.aClass5_Sub1_Sub2_12.method5703(this.anInt8865, this.anInt8863);
			this.anInt8863 = -1;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method7651(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt8862 != 0) {
			if (this.anInt8863 > 0) {
				OpenGL.glBindBufferARB(this.anInt8857, this.anInt8863);
				if (this.anInt8862 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8857, 0, this.anInt8867, this.aClass5_Sub1_Sub2_12.aNativeHeapBuffer5.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt8862 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)J")
	public final long method7652() {
		return this.anInt8863 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}
}
