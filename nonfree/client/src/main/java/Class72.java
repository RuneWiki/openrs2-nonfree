import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public abstract class Class72 implements Interface11 {

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	private int anInt6756;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
	private int anInt6762;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	private int anInt6767 = -1;

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
	private int anInt6765 = 0;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Z")
	private final boolean aBoolean441;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	private final int anInt6755;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!oaa;")
	protected final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_9;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!oaa;IZ)V")
	protected Class72(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean441 = arg2;
		this.anInt6755 = arg1;
		this.aClass132_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method5796(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt6762) {
			this.method5804();
			if (this.anInt6767 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
			OpenGL.glBufferDataARBa(this.anInt6755, arg0, arg1.getAddress(), this.aBoolean441 ? 35040 : 35044);
			this.aClass132_Sub1_Sub1_9.anInt8965 += arg0 - this.anInt6756;
			this.anInt6762 = arg0;
		} else if (this.anInt6767 > 0) {
			OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
			OpenGL.glBufferSubDataARBa(this.anInt6755, 0, this.anInt6756, arg1.getAddress());
			this.aClass132_Sub1_Sub1_9.anInt8965 += arg0 - this.anInt6756;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt6756 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method5797(@OriginalArg(0) MapBuffer arg0) {
		@Pc(10) boolean local10 = true;
		if (this.anInt6765 != 0) {
			if (this.anInt6767 > 0) {
				OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
				if (this.anInt6765 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6755, 0, this.anInt6762, this.aClass132_Sub1_Sub1_9.aNativeHeapBuffer8.getAddress());
				} else {
					local10 = arg0.a();
				}
			}
			this.anInt6765 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
	@Override
	public int method8886() {
		return this.anInt6756;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;I)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5799(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt6765 == 0) {
			this.method5804();
			if (this.anInt6767 <= 0) {
				this.anInt6765 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
			OpenGL.glBufferDataARBub(this.anInt6755, this.anInt6762, (byte[]) null, 0, this.aBoolean441 ? 35040 : 35044);
			if (this.aClass132_Sub1_Sub1_9.aNativeHeapBuffer8.b >= this.anInt6756) {
				this.anInt6765 = 1;
				return this.aClass132_Sub1_Sub1_9.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt6755, this.anInt6756, 35001)) {
				this.anInt6765 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public void method5800(@OriginalArg(0) int arg0) {
		if (this.anInt6762 < arg0) {
			this.method5804();
			if (this.anInt6767 <= 0) {
				this.aNativeHeapBuffer6 = this.aClass132_Sub1_Sub1_9.method7524(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
				OpenGL.glBufferDataARBub(this.anInt6755, arg0, (byte[]) null, 0, this.aBoolean441 ? 35040 : 35044);
				this.aClass132_Sub1_Sub1_9.anInt8965 += arg0 - this.anInt6762;
			}
			this.anInt6762 = arg0;
		}
		this.anInt6756 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)J")
	public final long method5801() {
		return this.anInt6767 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8887();
		super.finalize();
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method8887() {
		if (this.anInt6767 > 0) {
			this.aClass132_Sub1_Sub1_9.method6164(this.anInt6767, this.anInt6756);
			this.anInt6767 = -1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
	private void method5804() {
		if (this.anInt6767 >= 0) {
			return;
		}
		if (this.aClass132_Sub1_Sub1_9.aBoolean477) {
			OpenGL.glGenBuffersARB(1, Static346.anIntArray339, 0);
			this.anInt6767 = Static346.anIntArray339[0];
			OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
		} else {
			this.anInt6767 = 0;
		}
	}

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
	public final void method5805() {
		if (this.aClass132_Sub1_Sub1_9.aBoolean477) {
			OpenGL.glBindBufferARB(this.anInt6755, this.anInt6767);
		}
	}
}
