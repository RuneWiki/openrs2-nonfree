import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class89 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public int anInt2046 = -1;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "[I")
	private final int[] anIntArray178 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lclient!wp;")
	public Class219 method1703() {
		if (this.anIntArray176 == null) {
			return null;
		}
		@Pc(15) Class219[] local15 = new Class219[this.anIntArray176.length];
		@Pc(17) Class134 local17 = Static30.aClass134_13;
		synchronized (Static30.aClass134_13) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (this.anIntArray176.length <= local21) {
					break;
				}
				local15[local21] = Static154.method2690(this.anIntArray176[local21], Static30.aClass134_13);
				local21++;
			}
		}
		@Pc(59) Class219 local59;
		if (local15.length == 1) {
			local59 = local15[0];
		} else {
			local59 = new Class219(local15, local15.length);
		}
		if (local59 == null) {
			return null;
		}
		@Pc(73) int local73;
		if (this.aShortArray18 != null) {
			for (local73 = 0; local73 < this.aShortArray18.length; local73++) {
				local59.method5851(this.aShortArray17[local73], this.aShortArray18[local73]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local73 = 0; local73 < this.aShortArray19.length; local73++) {
				local59.method5847(this.aShortArray19[local73], this.aShortArray16[local73]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Z")
	public boolean method1704() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class134 local9 = Static30.aClass134_13;
		synchronized (Static30.aClass134_13) {
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.anIntArray178[local26] != -1 && !Static30.aClass134_13.method3011(this.anIntArray178[local26], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BILclient!nj;)V")
	private void method1705(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt2046 = arg1.method5720();
			return;
		}
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (arg0 == 2) {
			local24 = arg1.method5720();
			this.anIntArray176 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray176[local30] = arg1.method5715();
			}
		} else if (arg0 == 3) {
			this.aBoolean167 = true;
		} else if (arg0 == 40) {
			local24 = arg1.method5720();
			this.aShortArray17 = new short[local24];
			this.aShortArray18 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray18[local30] = (short) arg1.method5715();
				this.aShortArray17[local30] = (short) arg1.method5715();
			}
		} else if (arg0 == 41) {
			local24 = arg1.method5720();
			this.aShortArray19 = new short[local24];
			this.aShortArray16 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray19[local30] = (short) arg1.method5715();
				this.aShortArray16[local30] = (short) arg1.method5715();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray178[arg0 - 60] = arg1.method5715();
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Z")
	public boolean method1709() {
		if (this.anIntArray176 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class134 local14 = Static30.aClass134_13;
		synchronized (Static30.aClass134_13) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray176.length; local18++) {
				if (!Static30.aClass134_13.method3011(this.anIntArray176[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method1711(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method1705(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Lclient!wp;")
	public Class219 method1712() {
		@Pc(8) Class219[] local8 = new Class219[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class134 local12 = Static30.aClass134_13;
		synchronized (Static30.aClass134_13) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray178[local16] != -1) {
					local8[local10++] = Static154.method2690(this.anIntArray178[local16], Static30.aClass134_13);
				}
			}
		}
		@Pc(55) Class219 local55 = new Class219(local8, local10);
		@Pc(60) int local60;
		if (this.aShortArray18 != null) {
			for (local60 = 0; local60 < this.aShortArray18.length; local60++) {
				local55.method5851(this.aShortArray17[local60], this.aShortArray18[local60]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local60 = 0; local60 < this.aShortArray19.length; local60++) {
				local55.method5847(this.aShortArray19[local60], this.aShortArray16[local60]);
			}
		}
		return local55;
	}
}
