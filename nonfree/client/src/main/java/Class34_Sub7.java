import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class34_Sub7 extends Class34 {

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public int anInt6028;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Z")
	public boolean aBoolean416 = false;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	public int anInt6025 = 0;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!saa;")
	private Class317 aClass317_5 = new Class317();

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	private int anInt6026 = 0;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Lclient!qw;")
	public Class302 aClass302_40 = new Class302();

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	private int anInt6027 = 0;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Lclient!tv;")
	public final Class347 aClass347_1 = new Class347();

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "[Lclient!vm;")
	public final Class34_Sub3_Sub2_Sub1[] aClass34_Sub3_Sub2_Sub1Array2 = new Class34_Sub3_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IZ)V")
	public Class34_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5097(arg0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;[Lclient!vja;Z)V")
	private void method5086(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class373[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static350.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class34_Sub2 local16 = (Class34_Sub2) this.aClass317_5.method6891(); local16 != null; local16 = (Class34_Sub2) this.aClass317_5.method6894()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass373_1 == arg1[local21] || local16.aClass373_1 == arg1[local21].aClass373_2) {
						Static350.aBooleanArray20[local21] = true;
						local16.method2616();
						local16.aBoolean221 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt3023 == 0) {
				local16.method8764();
				this.anInt6026--;
			} else {
				local16.aBoolean221 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6026 != 32; local21++) {
			if (!Static350.aBooleanArray20[local21]) {
				@Pc(104) Class34_Sub2 local104 = new Class34_Sub2(arg0, arg1[local21], this, this.aLong164);
				this.aClass317_5.method6890(local104);
				this.anInt6026++;
				Static350.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5087(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong164 == this.aLong165) {
			this.method5091();
		} else {
			this.method5094();
		}
		if (arg1 - this.aLong164 > 750L) {
			this.method5098();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong165);
		@Pc(36) Class34_Sub2 local36;
		if (this.aBoolean418) {
			for (local36 = (Class34_Sub2) this.aClass317_5.method6891(); local36 != null; local36 = (Class34_Sub2) this.aClass317_5.method6894()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass307_1.anInt8153; local39++) {
					local36.method2615(1, !this.aBoolean415, arg0, arg1);
				}
			}
			this.aBoolean418 = false;
		}
		for (local36 = (Class34_Sub2) this.aClass317_5.method6891(); local36 != null; local36 = (Class34_Sub2) this.aClass317_5.method6894()) {
			local36.method2615(local27, !this.aBoolean415, arg0, arg1);
		}
		this.aLong165 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;J[Lclient!vja;[Lclient!rea;Z)V")
	public void method5088(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class373[] arg2, @OriginalArg(3) Class305[] arg3) {
		if (!this.aBoolean416) {
			this.method5086(arg0, arg2);
			this.method5099(arg3);
			this.aLong164 = arg1;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public void method5089() {
		this.aBoolean418 = true;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "()V")
	private void method5091() {
		this.aBoolean415 = false;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5092(@OriginalArg(0) Class95 arg0) {
		this.aClass347_1.aClass61_1.method1343();
		for (@Pc(10) Class34_Sub2 local10 = (Class34_Sub2) this.aClass317_5.method6891(); local10 != null; local10 = (Class34_Sub2) this.aClass317_5.method6894()) {
			local10.method2618(this.aLong165, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(J)V")
	public void method5093(@OriginalArg(0) long arg0) {
		this.aLong164 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "()V")
	public void method5094() {
		this.aBoolean415 = true;
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "()Lclient!tv;")
	public Class347 method5096() {
		this.aClass347_1.aClass61_1.method1343();
		for (@Pc(6) int local6 = 0; local6 < this.aClass34_Sub3_Sub2_Sub1Array2.length; local6++) {
			if (this.aClass34_Sub3_Sub2_Sub1Array2[local6] != null && this.aClass34_Sub3_Sub2_Sub1Array2[local6].aClass34_Sub2_1 != null) {
				this.aClass347_1.aClass61_1.method1344(this.aClass34_Sub3_Sub2_Sub1Array2[local6]);
			}
		}
		return this.aClass347_1;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(IZ)V")
	public void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static372.aClass317_6.method6890(this);
		this.aLong164 = (long) arg0;
		this.aLong165 = (long) arg0;
		this.aBoolean418 = true;
		this.aBoolean417 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "()V")
	public void method5098() {
		this.aBoolean416 = true;
		for (@Pc(8) Class3_Sub5_Sub17 local8 = (Class3_Sub5_Sub17) this.aClass302_40.method6603(); local8 != null; local8 = (Class3_Sub5_Sub17) this.aClass302_40.method6605()) {
			if (local8.aClass293_1.anInt7718 == 1) {
				local8.method9014();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass34_Sub3_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass34_Sub3_Sub2_Sub1Array2[local27] != null) {
				this.aClass34_Sub3_Sub2_Sub1Array2[local27].method8666();
				this.aClass34_Sub3_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt6025 = 0;
		this.aClass317_5 = new Class317();
		this.anInt6026 = 0;
		this.aClass302_40 = new Class302();
		this.anInt6027 = 0;
		this.method8764();
		Static660.aClass34_Sub7Array1[Static158.anInt2931] = this;
		Static158.anInt2931 = Static158.anInt2931 + 1 & Static196.anIntArray184[Static87.anInt1807];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lclient!rea;Z)V")
	private void method5099(@OriginalArg(0) Class305[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static350.aBooleanArray19[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub5_Sub17 local16 = (Class3_Sub5_Sub17) this.aClass302_40.method6603(); local16 != null; local16 = (Class3_Sub5_Sub17) this.aClass302_40.method6605()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass305_2 == arg0[local21] || local16.aClass305_2 == arg0[local21].aClass305_1) {
						Static350.aBooleanArray19[local21] = true;
						local16.method6821();
						continue label71;
					}
				}
			}
			local16.method9034();
			this.anInt6027--;
			if (local16.method9013()) {
				local16.method9014();
				Static499.anInt7887--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6027 != 8; local21++) {
			if (!Static350.aBooleanArray19[local21]) {
				@Pc(96) Class3_Sub5_Sub17 local96 = null;
				if (arg0[local21].method6722().anInt7718 == 1 && Static499.anInt7887 < 32) {
					local96 = new Class3_Sub5_Sub17(arg0[local21], this);
					Static287.aClass247_1.method5512((long) arg0[local21].anInt8112, local96);
					Static499.anInt7887++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub5_Sub17(arg0[local21], this);
				}
				this.aClass302_40.method6613(local96);
				this.anInt6027++;
				Static350.aBooleanArray19[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "()Lclient!tv;")
	public Class347 method5100() {
		return this.aClass347_1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public void method5101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6028 = arg0;
	}
}
