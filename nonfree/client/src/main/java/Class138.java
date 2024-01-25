import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class138 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Lclient!mr;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "[I")
	private final int[] anIntArray287 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class231("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
		new Class231("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Z")
	public boolean method2822() {
		if (this.anIntArray288 == null) {
			return true;
		}
		@Pc(15) boolean local15 = true;
		@Pc(19) Class171 local19 = this.aClass174_1.aClass171_62;
		synchronized (this.aClass174_1.aClass171_62) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray288.length; local23++) {
				if (!this.aClass174_1.aClass171_62.method3647(this.anIntArray288[local23], 0)) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!hw;I)V")
	private void method2823(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method6138();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (arg1 == 2) {
			local34 = arg0.method6138();
			this.anIntArray288 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray288[local44] = arg0.method6148();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local34 = arg0.method6138();
				this.aShortArray56 = new short[local34];
				this.aShortArray54 = new short[local34];
				for (local44 = 0; local44 < local34; local44++) {
					this.aShortArray54[local44] = (short) arg0.method6148();
					this.aShortArray56[local44] = (short) arg0.method6148();
				}
				return;
			}
			if (arg1 == 41) {
				local34 = arg0.method6138();
				this.aShortArray53 = new short[local34];
				this.aShortArray55 = new short[local34];
				for (local44 = 0; local44 < local34; local44++) {
					this.aShortArray55[local44] = (short) arg0.method6148();
					this.aShortArray53[local44] = (short) arg0.method6148();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray287[arg1 - 60] = arg0.method6148();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Lclient!fc;")
	public Class76 method2824() {
		if (this.anIntArray288 == null) {
			return null;
		}
		@Pc(13) Class76[] local13 = new Class76[this.anIntArray288.length];
		@Pc(17) Class171 local17 = this.aClass174_1.aClass171_62;
		@Pc(21) int local21;
		synchronized (this.aClass174_1.aClass171_62) {
			local21 = 0;
			while (true) {
				if (this.anIntArray288.length <= local21) {
					break;
				}
				local13[local21] = Static378.method5924(this.aClass174_1.aClass171_62, this.anIntArray288[local21]);
				local21++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray288.length; local59++) {
			if (local13[local59].anInt1809 < 13) {
				local13[local59].method1775();
			}
		}
		@Pc(93) Class76 local93;
		if (local13.length == 1) {
			local93 = local13[0];
		} else {
			local93 = new Class76(local13, local13.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray54 != null) {
			for (local21 = 0; local21 < this.aShortArray54.length; local21++) {
				local93.method1783(this.aShortArray54[local21], this.aShortArray56[local21]);
			}
		}
		if (this.aShortArray55 != null) {
			for (local21 = 0; local21 < this.aShortArray55.length; local21++) {
				local93.method1778(this.aShortArray55[local21], this.aShortArray53[local21]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!hw;)V")
	public void method2825(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6138();
			if (local14 == 0) {
				return;
			}
			this.method2823(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lclient!fc;")
	public Class76 method2826() {
		@Pc(8) Class76[] local8 = new Class76[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class171 local14 = this.aClass174_1.aClass171_62;
		@Pc(18) int local18;
		synchronized (this.aClass174_1.aClass171_62) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray287[local18] != -1) {
					local8[local10++] = Static378.method5924(this.aClass174_1.aClass171_62, this.anIntArray287[local18]);
				}
				local18++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt1809 < 13) {
				local8[local60].method1775();
			}
		}
		@Pc(90) Class76 local90 = new Class76(local8, local10);
		if (this.aShortArray54 != null) {
			for (local18 = 0; local18 < this.aShortArray54.length; local18++) {
				local90.method1783(this.aShortArray54[local18], this.aShortArray56[local18]);
			}
		}
		if (this.aShortArray55 != null) {
			for (local18 = 0; local18 < this.aShortArray55.length; local18++) {
				local90.method1778(this.aShortArray55[local18], this.aShortArray53[local18]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	public boolean method2828() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class171 local11 = this.aClass174_1.aClass171_62;
		synchronized (this.aClass174_1.aClass171_62) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray287[local15] != -1 && !this.aClass174_1.aClass171_62.method3647(this.anIntArray287[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
