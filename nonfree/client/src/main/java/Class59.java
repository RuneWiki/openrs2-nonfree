import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class59 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!kg;")
	public Class143 aClass143_2;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "[I")
	private final int[] anIntArray215 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class158("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public boolean method1492() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class211 local11 = this.aClass143_2.aClass211_53;
		synchronized (this.aClass143_2.aClass211_53) {
			for (@Pc(24) int local24 = 0; local24 < 5; local24++) {
				if (this.anIntArray215[local24] != -1 && !this.aClass143_2.aClass211_53.method4760(this.anIntArray215[local24], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Lclient!ko;")
	public Class147 method1494() {
		@Pc(8) Class147[] local8 = new Class147[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class211 local14 = this.aClass143_2.aClass211_53;
		@Pc(18) int local18;
		synchronized (this.aClass143_2.aClass211_53) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray215[local18] != -1) {
					local8[local10++] = Static354.method5036(this.aClass143_2.aClass211_53, this.anIntArray215[local18]);
				}
				local18++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local8[local54] != null && local8[local54].anInt4358 < 13) {
				local8[local54].method3372();
			}
		}
		@Pc(86) Class147 local86 = new Class147(local8, local10);
		if (this.aShortArray45 != null) {
			for (local18 = 0; local18 < this.aShortArray45.length; local18++) {
				local86.method3381(this.aShortArray46[local18], this.aShortArray45[local18]);
			}
		}
		if (this.aShortArray47 != null) {
			for (local18 = 0; local18 < this.aShortArray47.length; local18++) {
				local86.method3379(this.aShortArray48[local18], this.aShortArray47[local18]);
			}
		}
		return local86;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!ia;)V")
	private void method1496(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			arg1.method1171();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method1171();
			this.anIntArray216 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray216[local25] = arg1.method1177();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local19 = arg1.method1171();
				this.aShortArray46 = new short[local19];
				this.aShortArray45 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray45[local25] = (short) arg1.method1177();
					this.aShortArray46[local25] = (short) arg1.method1177();
				}
			} else if (arg0 == 41) {
				local19 = arg1.method1171();
				this.aShortArray48 = new short[local19];
				this.aShortArray47 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray47[local25] = (short) arg1.method1177();
					this.aShortArray48[local25] = (short) arg1.method1177();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray215[arg0 - 60] = arg1.method1177();
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
	public boolean method1498() {
		if (this.anIntArray216 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class211 local14 = this.aClass143_2.aClass211_53;
		synchronized (this.aClass143_2.aClass211_53) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray216.length; local24++) {
				if (!this.aClass143_2.aClass211_53.method4760(this.anIntArray216[local24], 0)) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lclient!ko;")
	public Class147 method1500() {
		if (this.anIntArray216 == null) {
			return null;
		}
		@Pc(13) Class147[] local13 = new Class147[this.anIntArray216.length];
		@Pc(22) Class211 local22 = this.aClass143_2.aClass211_53;
		@Pc(26) int local26;
		synchronized (this.aClass143_2.aClass211_53) {
			local26 = 0;
			while (true) {
				if (local26 >= this.anIntArray216.length) {
					break;
				}
				local13[local26] = Static354.method5036(this.aClass143_2.aClass211_53, this.anIntArray216[local26]);
				local26++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray216.length; local54++) {
			if (local13[local54].anInt4358 < 13) {
				local13[local54].method3372();
			}
		}
		@Pc(90) Class147 local90;
		if (local13.length == 1) {
			local90 = local13[0];
		} else {
			local90 = new Class147(local13, local13.length);
		}
		if (local90 == null) {
			return null;
		}
		if (this.aShortArray45 != null) {
			for (local26 = 0; local26 < this.aShortArray45.length; local26++) {
				local90.method3381(this.aShortArray46[local26], this.aShortArray45[local26]);
			}
		}
		if (this.aShortArray47 != null) {
			for (local26 = 0; local26 < this.aShortArray47.length; local26++) {
				local90.method3379(this.aShortArray48[local26], this.aShortArray47[local26]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method1503(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1171();
			if (local7 == 0) {
				return;
			}
			this.method1496(local7, arg0);
		}
	}
}
