import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class160 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!qb;")
	public Interface6 anInterface6_5;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_33;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "B")
	public byte aByte58;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!tb;Lclient!qb;III)V")
	public Class160(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInterface6_5 = arg1;
		this.aShort70 = (short) arg2;
		this.aClass129_Sub2_33 = arg0;
		this.aByte58 = (byte) arg4;
		this.aByte57 = (byte) arg3;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method4346() {
		this.aClass129_Sub2_33.method5093(this.anInterface6_5);
		this.anInterface6_5.method1919(this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public void method4347() {
		this.aClass129_Sub2_33.method5093(this.anInterface6_5);
		this.anInterface6_5.method1920(this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public void method4348() {
		this.aClass129_Sub2_33.method5093(this.anInterface6_5);
		this.anInterface6_5.method1921(this);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public void method4349() {
		this.aClass129_Sub2_33.method5093(this.anInterface6_5);
		this.anInterface6_5.method1923(this);
	}
}
