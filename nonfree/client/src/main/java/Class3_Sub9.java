import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int anInt10288;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public int anInt10286 = 0;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Z")
	public boolean aBoolean701 = false;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!tca;")
	private Class325 aClass325_9 = new Class325();

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	private int anInt10287 = 0;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "Lclient!uh;")
	public Class341 aClass341_66 = new Class341();

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "Z")
	public boolean aBoolean703 = false;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
	private int anInt10289 = 0;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "Z")
	private boolean aBoolean704 = false;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Lclient!mda;")
	public final Class203 aClass203_1 = new Class203();

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lclient!ps;")
	public final Class3_Sub2_Sub2_Sub1[] aClass3_Sub2_Sub2_Sub1Array2 = new Class3_Sub2_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IZ)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Lclient!mda;")
	public Class203 method8576() {
		return this.aClass203_1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ha;)V")
	public void method8579(@OriginalArg(0) Class20 arg0) {
		this.aClass203_1.aClass194_1.method5597();
		for (@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) this.aClass325_9.method8016(); local10 != null; local10 = (Class3_Sub7) this.aClass325_9.method8022()) {
			local10.method7480(arg0, this.aLong257);
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "()V")
	public void method8580() {
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "()V")
	public void method8581() {
		this.aBoolean701 = true;
		for (@Pc(8) Class2_Sub6_Sub12 local8 = (Class2_Sub6_Sub12) this.aClass341_66.method8524(); local8 != null; local8 = (Class2_Sub6_Sub12) this.aClass341_66.method8519()) {
			if (local8.aClass267_1.anInt8084 == 1) {
				local8.method8933();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass3_Sub2_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass3_Sub2_Sub2_Sub1Array2[local27] != null) {
				this.aClass3_Sub2_Sub2_Sub1Array2[local27].method6951();
				this.aClass3_Sub2_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt10286 = 0;
		this.aClass325_9 = new Class325();
		this.anInt10287 = 0;
		this.aClass341_66 = new Class341();
		this.anInt10289 = 0;
		this.method8909();
		Static99.aClass3_Sub9Array1[Static551.anInt3120] = this;
		Static551.anInt3120 = Static551.anInt3120 + 1 & Static480.anIntArray442[Static173.anInt4169];
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IZ)V")
	public void method8582(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static403.aClass325_5.method8013(this);
		this.aLong258 = arg0;
		this.aLong257 = arg0;
		this.aBoolean704 = true;
		this.aBoolean703 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ha;[Lclient!nn;Z)V")
	private void method8583(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class227[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static575.aBooleanArray28[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class3_Sub7 local16 = (Class3_Sub7) this.aClass325_9.method8016(); local16 != null; local16 = (Class3_Sub7) this.aClass325_9.method8022()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass227_2 == arg1[local21] || local16.aClass227_2 == arg1[local21].aClass227_1) {
						Static575.aBooleanArray28[local21] = true;
						local16.method7476();
						local16.aBoolean646 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8926 == 0) {
				local16.method8909();
				this.anInt10287--;
			} else {
				local16.aBoolean646 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt10287 != 32; local21++) {
			if (!Static575.aBooleanArray28[local21]) {
				@Pc(104) Class3_Sub7 local104 = new Class3_Sub7(arg0, arg1[local21], this, this.aLong258);
				this.aClass325_9.method8013(local104);
				this.anInt10287++;
				Static575.aBooleanArray28[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public void method8584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10288 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "()V")
	public void method8585() {
		this.aBoolean702 = true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method8586(@OriginalArg(0) Class20 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong258 == this.aLong257) {
			this.method8588();
		} else {
			this.method8585();
		}
		if (arg1 - this.aLong258 > 750L) {
			this.method8581();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong257);
		@Pc(36) Class3_Sub7 local36;
		if (this.aBoolean704) {
			for (local36 = (Class3_Sub7) this.aClass325_9.method8016(); local36 != null; local36 = (Class3_Sub7) this.aClass325_9.method8022()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass273_1.anInt8279; local39++) {
					local36.method7482(arg0, 1, arg1, !this.aBoolean702);
				}
			}
			this.aBoolean704 = false;
		}
		for (local36 = (Class3_Sub7) this.aClass325_9.method8016(); local36 != null; local36 = (Class3_Sub7) this.aClass325_9.method8022()) {
			local36.method7482(arg0, local27, arg1, !this.aBoolean702);
		}
		this.aLong257 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ha;J[Lclient!nn;[Lclient!eca;Z)V")
	public void method8587(@OriginalArg(0) Class20 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class227[] arg2, @OriginalArg(3) Class87[] arg3) {
		if (!this.aBoolean701) {
			this.method8583(arg0, arg2);
			this.method8589(arg3);
			this.aLong258 = arg1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "()V")
	private void method8588() {
		this.aBoolean702 = false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([Lclient!eca;Z)V")
	private void method8589(@OriginalArg(0) Class87[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static575.aBooleanArray29[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub6_Sub12 local16 = (Class2_Sub6_Sub12) this.aClass341_66.method8524(); local16 != null; local16 = (Class2_Sub6_Sub12) this.aClass341_66.method8519()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass87_2 == arg0[local21] || local16.aClass87_2 == arg0[local21].aClass87_1) {
						Static575.aBooleanArray29[local21] = true;
						local16.method4964();
						continue label71;
					}
				}
			}
			local16.method9253();
			this.anInt10289--;
			if (local16.method8935()) {
				local16.method8933();
				Static477.anInt8928--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt10289 != 8; local21++) {
			if (!Static575.aBooleanArray29[local21]) {
				@Pc(96) Class2_Sub6_Sub12 local96 = null;
				if (arg0[local21].method2909().anInt8084 == 1 && Static477.anInt8928 < 32) {
					local96 = new Class2_Sub6_Sub12(arg0[local21], this);
					Static407.aClass144_1.method4402(local96, (long) arg0[local21].anInt3140);
					Static477.anInt8928++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub6_Sub12(arg0[local21], this);
				}
				this.aClass341_66.method8528(local96);
				this.anInt10289++;
				Static575.aBooleanArray29[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "()Lclient!mda;")
	public Class203 method8590() {
		this.aClass203_1.aClass194_1.method5597();
		for (@Pc(6) int local6 = 0; local6 < this.aClass3_Sub2_Sub2_Sub1Array2.length; local6++) {
			if (this.aClass3_Sub2_Sub2_Sub1Array2[local6] != null && this.aClass3_Sub2_Sub2_Sub1Array2[local6].aClass3_Sub7_1 != null) {
				this.aClass203_1.aClass194_1.method5596(this.aClass3_Sub2_Sub2_Sub1Array2[local6]);
			}
		}
		return this.aClass203_1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(J)V")
	public void method8591(@OriginalArg(0) long arg0) {
		this.aLong258 = arg0;
	}
}
