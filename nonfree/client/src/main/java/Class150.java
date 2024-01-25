import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public abstract class Class150 implements Interface4 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	private int anInt8951;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	private int anInt8957;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt8952 = -1;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	private int anInt8946 = 0;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	private final int anInt8956;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
	private final boolean aBoolean618;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!ag;")
	private final Class9_Sub1_Sub1 aClass9_Sub1_Sub1_8;

	static {
		new Class114("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!ag;IZ)V")
	protected Class150(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt8956 = arg1;
		this.aBoolean618 = arg2;
		this.aClass9_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	private void method7518() {
		if (this.anInt8952 >= 0) {
			return;
		}
		if (this.aClass9_Sub1_Sub1_8.aBoolean52) {
			OpenGL.glGenBuffersARB(1, Static102.anIntArray192, 0);
			this.anInt8952 = Static102.anIntArray192[0];
			OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
		} else {
			this.anInt8952 = 0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method7519() {
		if (this.anInt8946 == 0) {
			this.method7518();
			if (this.anInt8952 <= 0) {
				this.anInt8946 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
			OpenGL.glBufferDataARBub(this.anInt8956, this.anInt8951, null, 0, this.aBoolean618 ? 35040 : 35044);
			if (this.anInt8957 <= this.aClass9_Sub1_Sub1_8.aNativeHeapBuffer8.a) {
				this.anInt8946 = 1;
				return this.aClass9_Sub1_Sub1_8.aNativeHeapBuffer8;
			}
			@Pc(54) MapBuffer local54 = this.aClass9_Sub1_Sub1_8.aMapBuffer1;
			if (!local54.b() && local54.a(this.anInt8956, this.anInt8957, 35001)) {
				this.anInt8946 = 2;
				return local54;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BI)Z")
	protected final boolean method7520(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt8951) {
			this.method7518();
			if (this.anInt8952 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
			OpenGL.glBufferDataARBa(this.anInt8956, arg1, arg0.getAddress(), this.aBoolean618 ? 35040 : 35044);
			this.aClass9_Sub1_Sub1_8.anInt9183 += arg1 - this.anInt8957;
			this.anInt8951 = arg1;
		} else if (this.anInt8952 > 0) {
			OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
			OpenGL.glBufferSubDataARBa(this.anInt8956, 0, this.anInt8957, arg0.getAddress());
			this.aClass9_Sub1_Sub1_8.anInt9183 += arg1 - this.anInt8957;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt8957 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
	public boolean method7521() {
		@Pc(10) boolean local10 = true;
		if (this.anInt8946 != 0) {
			if (this.anInt8952 > 0) {
				OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
				if (this.anInt8946 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8956, 0, this.anInt8951, this.aClass9_Sub1_Sub1_8.aNativeHeapBuffer8.getAddress());
				} else {
					local10 = this.aClass9_Sub1_Sub1_8.aMapBuffer1.a();
				}
			}
			this.anInt8946 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
	@Override
	public int method7517() {
		return this.anInt8957;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)J")
	public final long method7523() {
		return this.anInt8952 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public final void method7524() {
		if (this.aClass9_Sub1_Sub1_8.aBoolean52) {
			OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public void method7526(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt8951) {
			this.method7518();
			if (this.anInt8952 > 0) {
				OpenGL.glBindBufferARB(this.anInt8956, this.anInt8952);
				OpenGL.glBufferDataARBub(this.anInt8956, arg0, null, 0, this.aBoolean618 ? 35040 : 35044);
				this.aClass9_Sub1_Sub1_8.anInt9183 += arg0 - this.anInt8951;
			} else {
				this.aNativeHeapBuffer7 = this.aClass9_Sub1_Sub1_8.method7714(false, arg0);
			}
			this.anInt8951 = arg0;
		}
		this.anInt8957 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	public void method7527() {
		if (this.anInt8952 > 0) {
			this.aClass9_Sub1_Sub1_8.method681(this.anInt8957, this.anInt8952);
			this.anInt8952 = -1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7527();
		super.finalize();
	}
}
