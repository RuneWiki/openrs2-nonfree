import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class267 {

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	public int anInt7877;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "Lclient!nga;")
	private final Class233 aClass233_38 = new Class233(64);

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "Lclient!nga;")
	public final Class233 aClass233_39 = new Class233(50);

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Lclient!fq;")
	public final Class115 aClass115_1 = new Class115(250);

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "Lclient!jf;")
	private final Class172 aClass172_1 = new Class172();

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!eq;")
	public final Class97 aClass97_112;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "Lclient!lm;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	public final int anInt7869;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Lclient!eq;")
	private final Class97 aClass97_113;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	public final int anInt7871;

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray31;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!cw;IZLclient!lm;Lclient!eq;Lclient!eq;)V")
	public Class267(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) Class97 arg5) {
		this.aClass97_112 = arg5;
		this.aClass206_1 = arg3;
		this.aBoolean593 = arg2;
		this.anInt7869 = arg1;
		this.aClass97_113 = arg4;
		if (this.aClass97_113 == null) {
			this.anInt7871 = 0;
		} else {
			@Pc(53) int local53 = this.aClass97_113.method2546() - 1;
			this.anInt7871 = this.aClass97_113.method2569(local53) + local53 * 256;
		}
		this.aStringArray30 = new String[] { null, null, Static628.aClass369_7.method8475(this.anInt7869), null, null };
		this.aStringArray31 = new String[] { null, null, null, null, Static628.aClass369_8.method8475(this.anInt7869) };
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public void method6593() {
		@Pc(6) Class115 local6 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3031();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public void method6596() {
		@Pc(2) Class233 local2 = this.aClass233_38;
		synchronized (this.aClass233_38) {
			this.aClass233_38.method5663();
		}
		local2 = this.aClass233_39;
		synchronized (this.aClass233_39) {
			this.aClass233_39.method5663();
		}
		@Pc(44) Class115 local44 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3031();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)Lclient!ok;")
	public Class245 method6597(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_38;
		@Pc(16) Class245 local16;
		synchronized (this.aClass233_38) {
			local16 = (Class245) this.aClass233_38.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_113;
		@Pc(42) byte[] local42;
		synchronized (this.aClass97_113) {
			local42 = this.aClass97_113.method2545(Static295.method4634(arg0), Static89.method1582(arg0));
		}
		local16 = new Class245();
		local16.aClass267_1 = this;
		local16.anInt7496 = arg0;
		local16.aStringArray26 = new String[] { null, null, Static628.aClass369_7.method8475(this.anInt7869), null, null };
		local16.aStringArray27 = new String[] { null, null, null, null, Static628.aClass369_8.method8475(this.anInt7869) };
		if (local42 != null) {
			local16.method6274(new Class2_Sub34(local42));
		}
		local16.method6279();
		if (local16.anInt7460 != -1) {
			local16.method6270(this.method6597(local16.anInt7460), this.method6597(local16.anInt7461));
		}
		if (local16.anInt7478 != -1) {
			local16.method6272(this.method6597(local16.anInt7478), this.method6597(local16.anInt7470));
		}
		if (!this.aBoolean593 && local16.aBoolean566) {
			local16.aString72 = Static628.aClass369_5.method8475(this.anInt7869);
			local16.aStringArray27 = this.aStringArray31;
			local16.aStringArray26 = this.aStringArray30;
			local16.anInt7505 = 0;
			local16.aBoolean567 = false;
			local16.anIntArray506 = null;
			if (local16.aClass222_30 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class2 local209 = local16.aClass222_30.method5474(); local209 != null; local209 = local16.aClass222_30.method5472()) {
					@Pc(218) Class79 local218 = this.aClass206_1.method4916((int) local209.aLong287);
					if (local218.aBoolean180) {
						local209.method8599();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local16.aClass222_30 = null;
				}
			}
		}
		@Pc(242) Class233 local242 = this.aClass233_38;
		synchronized (this.aClass233_38) {
			this.aClass233_38.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!da;IIZLclient!in;ZIILclient!ha;BLclient!ha;I)Lclient!kr;")
	public Class20 method6598(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class87 arg8, @OriginalArg(10) Class87 arg9, @OriginalArg(11) int arg10) {
		@Pc(21) Class20 local21 = this.method6602(arg6, arg10, arg1, arg8, arg2, arg7, arg4);
		if (local21 != null) {
			return local21;
		}
		@Pc(30) Class245 local30 = this.method6597(arg6);
		if (arg1 > 1 && local30.anIntArray504 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg1 >= local30.anIntArray505[local40] && local30.anIntArray505[local40] != 0) {
					local38 = local30.anIntArray504[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method6597(local38);
			}
		}
		@Pc(89) int[] local89 = local30.method6273(arg5, arg0, arg8, arg4, arg10, arg2, arg1, arg9, arg7);
		if (local89 == null) {
			return null;
		}
		@Pc(104) Class20 local104;
		if (arg3) {
			local104 = arg9.method7913(36, local89, 36, 32);
		} else {
			local104 = arg8.method7913(36, local89, 36, 32);
		}
		if (!arg3) {
			@Pc(121) Class172 local121 = new Class172();
			local121.anInt5097 = arg10;
			local121.anInt5090 = arg2;
			local121.anInt5093 = arg8.anInt9444;
			local121.aBoolean405 = arg4 != null;
			local121.anInt5094 = arg1;
			local121.anInt5091 = arg7;
			local121.anInt5096 = arg6;
			this.aClass115_1.method3021(local121, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	public void method6599() {
		@Pc(9) Class233 local9 = this.aClass233_39;
		synchronized (this.aClass233_39) {
			this.aClass233_39.method5663();
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)V")
	public void method6600() {
		@Pc(6) Class233 local6 = this.aClass233_38;
		synchronized (this.aClass233_38) {
			this.aClass233_38.method5664(5);
		}
		local6 = this.aClass233_39;
		synchronized (this.aClass233_39) {
			this.aClass233_39.method5664(5);
		}
		@Pc(43) Class115 local43 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3034();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)V")
	public void method6601(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean593 != arg0) {
			this.aBoolean593 = arg0;
			this.method6596();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILclient!ha;IIBLclient!in;)Lclient!kr;")
	public Class20 method6602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class163 arg6) {
		this.aClass172_1.anInt5094 = arg2;
		this.aClass172_1.anInt5091 = arg5;
		this.aClass172_1.anInt5096 = arg0;
		this.aClass172_1.aBoolean405 = arg6 != null;
		this.aClass172_1.anInt5093 = arg3.anInt9444;
		this.aClass172_1.anInt5090 = arg4;
		this.aClass172_1.anInt5097 = arg1;
		return (Class20) this.aClass115_1.method3029(this.aClass172_1);
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
	public void method6604() {
		@Pc(6) Class233 local6 = this.aClass233_38;
		synchronized (this.aClass233_38) {
			this.aClass233_38.method5665();
		}
		local6 = this.aClass233_39;
		synchronized (this.aClass233_39) {
			this.aClass233_39.method5665();
		}
		@Pc(42) Class115 local42 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3026();
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(II)V")
	public void method6605(@OriginalArg(1) int arg0) {
		this.anInt7877 = arg0;
		@Pc(13) Class233 local13 = this.aClass233_39;
		synchronized (this.aClass233_39) {
			this.aClass233_39.method5663();
		}
	}
}
