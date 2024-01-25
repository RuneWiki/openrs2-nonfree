import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class70 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Lclient!jt;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "[I")
	private final int[] anIntArray83 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class151("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)Lclient!qc;")
	public Class199 method1438() {
		if (this.anIntArray82 == null) {
			return null;
		}
		@Pc(15) Class199[] local15 = new Class199[this.anIntArray82.length];
		@Pc(19) Class113 local19 = this.aClass129_1.aClass113_63;
		@Pc(23) int local23;
		synchronized (this.aClass129_1.aClass113_63) {
			local23 = 0;
			while (true) {
				if (this.anIntArray82.length <= local23) {
					break;
				}
				local15[local23] = Static443.method4784(this.aClass129_1.aClass113_63, this.anIntArray82[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray82.length; local56++) {
			if (local15[local56].anInt5301 < 13) {
				local15[local56].method4137();
			}
		}
		@Pc(97) Class199 local97;
		if (local15.length == 1) {
			local97 = local15[0];
		} else {
			local97 = new Class199(local15, local15.length);
		}
		if (local97 == null) {
			return null;
		}
		if (this.aShortArray26 != null) {
			for (local23 = 0; local23 < this.aShortArray26.length; local23++) {
				local97.method4135(this.aShortArray28[local23], this.aShortArray26[local23]);
			}
		}
		if (this.aShortArray27 != null) {
			for (local23 = 0; local23 < this.aShortArray27.length; local23++) {
				local97.method4132(this.aShortArray27[local23], this.aShortArray29[local23]);
			}
		}
		return local97;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!dh;)V")
	private void method1439(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			arg1.method4463();
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (arg0 == 2) {
			local48 = arg1.method4463();
			this.anIntArray82 = new int[local48];
			for (local58 = 0; local58 < local48; local58++) {
				this.anIntArray82[local58] = arg1.method4485();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local48 = arg1.method4463();
				this.aShortArray28 = new short[local48];
				this.aShortArray26 = new short[local48];
				for (local58 = 0; local58 < local48; local58++) {
					this.aShortArray26[local58] = (short) arg1.method4485();
					this.aShortArray28[local58] = (short) arg1.method4485();
				}
			} else if (arg0 == 41) {
				local48 = arg1.method4463();
				this.aShortArray29 = new short[local48];
				this.aShortArray27 = new short[local48];
				for (local58 = 0; local58 < local48; local58++) {
					this.aShortArray27[local58] = (short) arg1.method4485();
					this.aShortArray29[local58] = (short) arg1.method4485();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray83[arg0 - 60] = arg1.method4485();
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!dh;Z)V")
	public void method1440(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4463();
			if (local15 == 0) {
				return;
			}
			this.method1439(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z")
	public boolean method1444() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class113 local16 = this.aClass129_1.aClass113_63;
		synchronized (this.aClass129_1.aClass113_63) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray83[local20] != -1 && !this.aClass129_1.aClass113_63.method2251(0, this.anIntArray83[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Z")
	public boolean method1445() {
		if (this.anIntArray82 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class113 local16 = this.aClass129_1.aClass113_63;
		synchronized (this.aClass129_1.aClass113_63) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray82.length; local20++) {
				if (!this.aClass129_1.aClass113_63.method2251(0, this.anIntArray82[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)Lclient!qc;")
	public Class199 method1446() {
		@Pc(16) Class199[] local16 = new Class199[5];
		@Pc(18) int local18 = 0;
		@Pc(22) Class113 local22 = this.aClass129_1.aClass113_63;
		@Pc(26) int local26;
		synchronized (this.aClass129_1.aClass113_63) {
			local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray83[local26] != -1) {
					local16[local18++] = Static443.method4784(this.aClass129_1.aClass113_63, this.anIntArray83[local26]);
				}
				local26++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < 5; local63++) {
			if (local16[local63] != null && local16[local63].anInt5301 < 13) {
				local16[local63].method4137();
			}
		}
		@Pc(91) Class199 local91 = new Class199(local16, local18);
		if (this.aShortArray26 != null) {
			for (local26 = 0; local26 < this.aShortArray26.length; local26++) {
				local91.method4135(this.aShortArray28[local26], this.aShortArray26[local26]);
			}
		}
		if (this.aShortArray27 != null) {
			for (local26 = 0; local26 < this.aShortArray27.length; local26++) {
				local91.method4132(this.aShortArray27[local26], this.aShortArray29[local26]);
			}
		}
		return local91;
	}
}
