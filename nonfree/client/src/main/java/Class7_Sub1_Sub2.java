import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_2;

	static {
		new Class189("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIILclient!ag;)V")
	public Class7_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub1 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass7_Sub1_2 = arg3;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return 0;
	}
}
