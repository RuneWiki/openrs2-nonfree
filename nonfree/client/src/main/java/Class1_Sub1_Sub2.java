import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!et", name = "I", descriptor = "Lclient!rr;")
	public Class1_Sub1 aClass1_Sub1_1;

	static {
		new Class175("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIILclient!rr;)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static245.method3783(arg0, arg1));
		this.aClass1_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)I")
	@Override
	public int method4302() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
	}
}
