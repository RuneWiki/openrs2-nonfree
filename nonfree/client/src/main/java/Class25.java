import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class25 {

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
	public int anInt769 = 128;

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
	public int anInt777 = 128;

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt775 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IIIIII)V")
	private Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt775 = arg0;
		this.anInt770 = arg3;
		this.anInt776 = arg5;
		this.anInt769 = arg1;
		this.anInt771 = arg4;
		this.anInt777 = arg2;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLclient!bea;)V")
	public void method713(@OriginalArg(1) Class25 arg0) {
		this.anInt769 = arg0.anInt769;
		this.anInt771 = arg0.anInt771;
		this.anInt776 = arg0.anInt776;
		this.anInt777 = arg0.anInt777;
		this.anInt770 = arg0.anInt770;
		this.anInt775 = arg0.anInt775;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)Lclient!bea;")
	public Class25 method714() {
		return new Class25(this.anInt775, this.anInt769, this.anInt777, this.anInt770, this.anInt771, this.anInt776);
	}
}
