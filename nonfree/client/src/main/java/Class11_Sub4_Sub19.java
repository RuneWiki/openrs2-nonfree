import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class11_Sub4_Sub19 extends Class11_Sub4 {

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Lclient!ec;")
	public Class58 aClass58_36;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	private int anInt6221;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ui", name = "N", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "Lclient!ec;")
	private Class58 aClass58_37;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "Ljava/lang/String;")
	private String aString61 = "null";

	static {
		new Class117("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	private void method5326() {
		this.aClass58_37 = new Class58(this.aClass58_36.method1007());
		for (@Pc(26) Class11_Sub33 local26 = (Class11_Sub33) this.aClass58_36.method1008(); local26 != null; local26 = (Class11_Sub33) this.aClass58_36.method1004()) {
			@Pc(35) Class11_Sub33 local35 = new Class11_Sub33((int) local26.aLong215);
			this.aClass58_37.method1006((long) local26.anInt5153, local35);
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
	private void method5327() {
		this.aClass58_37 = new Class58(this.aClass58_36.method1007());
		for (@Pc(26) Class11_Sub30 local26 = (Class11_Sub30) this.aClass58_36.method1008(); local26 != null; local26 = (Class11_Sub30) this.aClass58_36.method1004()) {
			@Pc(37) Class11_Sub11 local37 = new Class11_Sub11(local26.aString43, (int) local26.aLong215);
			this.aClass58_37.method1006(Static25.method5365(local26.aString43), local37);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method5329(@OriginalArg(0) int arg0) {
		if (this.aClass58_36 == null) {
			return this.aString61;
		} else {
			@Pc(24) Class11_Sub30 local24 = (Class11_Sub30) this.aClass58_36.method1009((long) arg0);
			return local24 == null ? this.aString61 : local24.aString43;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method5330(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method5333(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)I")
	public int method5332(@OriginalArg(0) int arg0) {
		if (this.aClass58_36 == null) {
			return this.anInt6221;
		} else {
			@Pc(17) Class11_Sub33 local17 = (Class11_Sub33) this.aClass58_36.method1009((long) arg0);
			return local17 == null ? this.anInt6221 : local17.anInt5153;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!kh;I)V")
	private void method5333(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static35.method516(arg0.method5175());
		} else if (arg1 == 2) {
			this.aChar4 = Static35.method516(arg0.method5175());
		} else if (arg1 == 3) {
			this.aString61 = arg0.method5184();
		} else if (arg1 == 4) {
			this.anInt6221 = arg0.method5198();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(47) int local47 = arg0.method5187();
			this.aClass58_36 = new Class58(Static90.method4097(local47));
			for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
				@Pc(63) int local63 = arg0.method5198();
				@Pc(73) Class11 local73;
				if (arg1 == 5) {
					local73 = new Class11_Sub30(arg0.method5184());
				} else {
					local73 = new Class11_Sub33(arg0.method5198());
				}
				this.aClass58_36.method1006((long) local63, local73);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)Z")
	public boolean method5334(@OriginalArg(1) int arg0) {
		if (this.aClass58_36 == null) {
			return false;
		}
		if (this.aClass58_37 == null) {
			this.method5326();
		}
		@Pc(30) Class11_Sub33 local30 = (Class11_Sub33) this.aClass58_37.method1009((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5335(@OriginalArg(1) String arg0) {
		if (this.aClass58_36 == null) {
			return false;
		}
		if (this.aClass58_37 == null) {
			this.method5327();
		}
		for (@Pc(30) Class11_Sub11 local30 = (Class11_Sub11) this.aClass58_37.method1009(Static25.method5365(arg0)); local30 != null; local30 = (Class11_Sub11) this.aClass58_37.method1005()) {
			if (local30.aString11.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
