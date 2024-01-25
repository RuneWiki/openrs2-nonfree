import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class231 {

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!mc;")
	private final Class185 aClass185_10 = new Class185();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private int anInt7398;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private final int anInt7413;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!ica;")
	private final Class127 aClass127_37;

	static {
		new Class202("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class231(@OriginalArg(0) int arg0) {
		this.anInt7398 = arg0;
		this.anInt7413 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass127_37 = new Class127(local14);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method6227() {
		for (@Pc(15) Class2_Sub13_Sub12 local15 = (Class2_Sub13_Sub12) this.aClass185_10.method4623(); local15 != null; local15 = (Class2_Sub13_Sub12) this.aClass185_10.method4617()) {
			if (local15.method6642()) {
				local15.method7802();
				local15.method7527();
				this.anInt7398 += local15.anInt7935;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method6228(@OriginalArg(0) long arg0) {
		@Pc(17) Class2_Sub13_Sub12 local17 = (Class2_Sub13_Sub12) this.aClass127_37.method3205(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(25) Object local25 = local17.method6647();
		if (local25 == null) {
			local17.method7802();
			local17.method7527();
			this.anInt7398 += local17.anInt7935;
			return null;
		}
		if (local17.method6642()) {
			@Pc(55) Class2_Sub13_Sub12_Sub1 local55 = new Class2_Sub13_Sub12_Sub1(local25, local17.anInt7935);
			this.aClass127_37.method3213(local55, local17.aLong241);
			this.aClass185_10.method4621(local55);
			local55.aLong230 = 0L;
			local17.method7802();
			local17.method7527();
		} else {
			this.aClass185_10.method4621(local17);
			local17.aLong230 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!un;I)V")
	private void method6229(@OriginalArg(0) Class2_Sub13_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method7802();
			arg0.method7527();
			this.anInt7398 += arg0.anInt7935;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method6230() {
		@Pc(17) Class2_Sub13_Sub12 local17 = (Class2_Sub13_Sub12) this.aClass127_37.method3212();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method6647();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class2_Sub13_Sub12 local27 = local17;
			local17 = (Class2_Sub13_Sub12) this.aClass127_37.method3212();
			local27.method7802();
			local27.method7527();
			this.anInt7398 += local17.anInt7935;
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
	public void method6231(@OriginalArg(0) int arg0) {
		if (Static489.aClass138_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub13_Sub12 local9 = (Class2_Sub13_Sub12) this.aClass185_10.method4623(); local9 != null; local9 = (Class2_Sub13_Sub12) this.aClass185_10.method4617()) {
			if (local9.method6642()) {
				if (local9.method6647() == null) {
					local9.method7802();
					local9.method7527();
					this.anInt7398++;
				}
			} else if ((long) arg0 < ++local9.aLong230) {
				@Pc(49) Class2_Sub13_Sub12 local49 = Static489.aClass138_1.method3405(local9);
				this.aClass127_37.method3213(local49, local9.aLong241);
				Static313.method5812(local9, local49);
				local9.method7802();
				local9.method7527();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
	public void method6232(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method6238(arg1, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method6233() {
		@Pc(16) Class2_Sub13_Sub12 local16 = (Class2_Sub13_Sub12) this.aClass127_37.method3203();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method6647();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class2_Sub13_Sub12 local28 = local16;
			local16 = (Class2_Sub13_Sub12) this.aClass127_37.method3212();
			local28.method7802();
			local28.method7527();
			this.anInt7398 += local16.anInt7935;
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
	public int method6234() {
		return this.anInt7413;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(JI)V")
	private void method6235(@OriginalArg(0) long arg0) {
		@Pc(14) Class2_Sub13_Sub12 local14 = (Class2_Sub13_Sub12) this.aClass127_37.method3205(arg0);
		this.method6229(local14);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JIILjava/lang/Object;)V")
	private void method6238(@OriginalArg(0) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt7413 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6235(arg0);
		this.anInt7398--;
		while (this.anInt7398 < 0) {
			@Pc(36) Class2_Sub13_Sub12 local36 = (Class2_Sub13_Sub12) this.aClass185_10.method4622();
			this.method6229(local36);
		}
		@Pc(52) Class2_Sub13_Sub12_Sub1 local52 = new Class2_Sub13_Sub12_Sub1(arg1, 1);
		this.aClass127_37.method3213(local52, arg0);
		this.aClass185_10.method4621(local52);
		local52.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	public int method6239() {
		return this.anInt7398;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	public void method6240() {
		this.aClass185_10.method4624();
		this.aClass127_37.method3204();
		this.anInt7398 = this.anInt7413;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int method6242() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub13_Sub12 local13 = (Class2_Sub13_Sub12) this.aClass185_10.method4623(); local13 != null; local13 = (Class2_Sub13_Sub12) this.aClass185_10.method4617()) {
			if (!local13.method6642()) {
				local7++;
			}
		}
		return local7;
	}
}
