import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class204 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public int anInt5704;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!wf;")
	public Class263 aClass263_3;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
	public int anInt5707;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
	public boolean aBoolean650 = false;

	static {
		new Class119("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z")
	public boolean method4496() {
		return this.aClass263_3.aClass82_103.method1820(this.anInt5707);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method4497(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt5707 = arg1.method5335();
		} else if (arg0 == 2) {
			this.anInt5704 = arg1.method5345();
		} else if (arg0 == 3) {
			this.aBoolean650 = true;
		} else if (arg0 == 4) {
			this.anInt5707 = -1;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method4498(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5337();
			if (local9 == 0) {
				return;
			}
			this.method4497(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!za;IIZ)Lclient!o;")
	public Class6 method4502(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt7333 << 19 | this.anInt5707 | arg1 << 16 | (arg2 ? 262144 : 0));
		@Pc(32) Class6 local32 = (Class6) this.aClass263_3.aClass102_60.method2258(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass263_3.aClass82_103.method1820(this.anInt5707)) {
			@Pc(59) Class72 local59 = Static460.method1572(this.aClass263_3.aClass82_103, this.anInt5707, 0);
			if (local59 != null) {
				local59.anInt1853 = local59.anInt1854 = local59.anInt1852 = local59.anInt1856 = 0;
				if (arg2) {
					local59.method1574();
				}
				for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
					local59.method1567();
				}
			}
			local32 = arg0.method5756(local59);
			if (local32 != null) {
				this.aClass263_3.aClass102_60.method2272(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
