import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public abstract class Class17 implements Interface14 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
	private int anInt1591;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
	private int anInt1592;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	private int anInt1581 = -1;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	private int anInt1587 = 0;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	private final int anInt1582;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!dc;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Z")
	private final boolean aBoolean139;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!dc;IZ)V")
	protected Class17(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1582 = arg1;
		this.aClass66_Sub1_Sub1_4 = arg0;
		this.aBoolean139 = arg2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public void method7148(@OriginalArg(1) int arg0) {
		if (this.anInt1591 < arg0) {
			this.method1345();
			if (this.anInt1581 <= 0) {
				this.aNativeHeapBuffer3 = this.aClass66_Sub1_Sub1_4.method6900(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
				OpenGL.glBufferDataARBub(this.anInt1582, arg0, null, 0, this.aBoolean139 ? 35040 : 35044);
				this.aClass66_Sub1_Sub1_4.anInt8407 += arg0 - this.anInt1591;
			}
			this.anInt1591 = arg0;
		}
		this.anInt1592 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public void method7146() {
		if (this.anInt1581 > 0) {
			this.aClass66_Sub1_Sub1_4.method2036(this.anInt1581, this.anInt1592);
			this.anInt1581 = -1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method1343(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt1591) {
			this.method1345();
			if (this.anInt1581 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
			OpenGL.glBufferDataARBa(this.anInt1582, arg0, arg1.getAddress(), this.aBoolean139 ? 35040 : 35044);
			this.aClass66_Sub1_Sub1_4.anInt8407 += arg0 - this.anInt1592;
			this.anInt1591 = arg0;
		} else if (this.anInt1581 > 0) {
			OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
			OpenGL.glBufferSubDataARBa(this.anInt1582, 0, this.anInt1592, arg1.getAddress());
			this.aClass66_Sub1_Sub1_4.anInt8407 += arg0 - this.anInt1592;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt1592 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7146();
		super.finalize();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
	@Override
	public int method7145() {
		return this.anInt1592;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	public final void method1344() {
		if (this.aClass66_Sub1_Sub1_4.aBoolean186) {
			OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	private void method1345() {
		if (this.anInt1581 >= 0) {
			return;
		}
		if (this.aClass66_Sub1_Sub1_4.aBoolean186) {
			OpenGL.glGenBuffersARB(1, Static398.anIntArray575, 0);
			this.anInt1581 = Static398.anIntArray575[0];
			OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
		} else {
			this.anInt1581 = 0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)J")
	public final long method1346() {
		return this.anInt1581 == 0 ? this.aNativeHeapBuffer3.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	public boolean method7150() {
		@Pc(11) boolean local11 = true;
		if (this.anInt1587 != 0) {
			if (this.anInt1581 > 0) {
				OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
				if (this.anInt1587 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt1582, 0, this.anInt1591, this.aClass66_Sub1_Sub1_4.aNativeHeapBuffer8.getAddress());
				} else {
					local11 = this.aClass66_Sub1_Sub1_4.aMapBuffer1.b();
				}
			}
			this.anInt1587 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method7149() {
		if (this.anInt1587 == 0) {
			this.method1345();
			if (this.anInt1581 <= 0) {
				this.anInt1587 = 2;
				return this.aNativeHeapBuffer3;
			}
			OpenGL.glBindBufferARB(this.anInt1582, this.anInt1581);
			OpenGL.glBufferDataARBub(this.anInt1582, this.anInt1591, null, 0, this.aBoolean139 ? 35040 : 35044);
			if (this.anInt1592 <= this.aClass66_Sub1_Sub1_4.aNativeHeapBuffer8.a) {
				this.anInt1587 = 1;
				return this.aClass66_Sub1_Sub1_4.aNativeHeapBuffer8;
			}
			@Pc(53) MapBuffer local53 = this.aClass66_Sub1_Sub1_4.aMapBuffer1;
			if (!local53.a() && local53.a(this.anInt1582, this.anInt1592, 35001)) {
				this.anInt1587 = 2;
				return local53;
			}
		}
		return null;
	}
}
