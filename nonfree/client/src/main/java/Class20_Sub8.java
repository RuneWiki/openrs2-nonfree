import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "J")
	private long aLong193;

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
	public int anInt7727;

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
	public boolean aBoolean519 = false;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
	public int anInt7724 = 0;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "Lclient!eia;")
	private Class81 aClass81_8 = new Class81();

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
	private int anInt7725 = 0;

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "Lclient!ada;")
	public Class8 aClass8_52 = new Class8();

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "Z")
	private boolean aBoolean520 = false;

	@OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
	private int anInt7726 = 0;

	@OriginalMember(owner = "client!paa", name = "y", descriptor = "Z")
	public boolean aBoolean521 = false;

	@OriginalMember(owner = "client!paa", name = "u", descriptor = "Lclient!of;")
	public final Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "[Lclient!rs;")
	public final Class20_Sub6_Sub1_Sub1[] aClass20_Sub6_Sub1_Sub1Array1 = new Class20_Sub6_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(IZ)V")
	public Class20_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6640(arg0, arg1);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "()V")
	public void method6630() {
		this.aBoolean520 = true;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "()Lclient!of;")
	public Class236 method6631() {
		return this.aClass236_1;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "()V")
	public void method6633() {
		this.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;J[Lclient!wr;[Lclient!ol;Z)V")
	public void method6634(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class382[] arg2, @OriginalArg(3) Class243[] arg3) {
		if (!this.aBoolean519) {
			this.method6635(arg0, arg2);
			this.method6639(arg3);
			this.aLong194 = arg1;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;[Lclient!wr;Z)V")
	private void method6635(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class382[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static423.aBooleanArray39[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class20_Sub7 local16 = (Class20_Sub7) this.aClass81_8.method2118(); local16 != null; local16 = (Class20_Sub7) this.aClass81_8.method2128()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass382_1 == arg1[local21] || local16.aClass382_1 == arg1[local21].aClass382_2) {
						Static423.aBooleanArray39[local21] = true;
						local16.method5055();
						local16.aBoolean387 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt5764 == 0) {
				local16.method9004();
				this.anInt7725--;
			} else {
				local16.aBoolean387 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt7725 != 32; local21++) {
			if (!Static423.aBooleanArray39[local21]) {
				@Pc(104) Class20_Sub7 local104 = new Class20_Sub7(arg0, arg1[local21], this, this.aLong194);
				this.aClass81_8.method2119(local104);
				this.anInt7725++;
				Static423.aBooleanArray39[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIII)V")
	public void method6636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7727 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;)V")
	public void method6638(@OriginalArg(0) Class100 arg0) {
		this.aClass236_1.aClass157_1.method4492();
		for (@Pc(10) Class20_Sub7 local10 = (Class20_Sub7) this.aClass81_8.method2118(); local10 != null; local10 = (Class20_Sub7) this.aClass81_8.method2128()) {
			local10.method5054(arg0, this.aLong193);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([Lclient!ol;Z)V")
	private void method6639(@OriginalArg(0) Class243[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static423.aBooleanArray40[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub2_Sub15 local16 = (Class6_Sub2_Sub15) this.aClass8_52.method149(); local16 != null; local16 = (Class6_Sub2_Sub15) this.aClass8_52.method155()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass243_1 == arg0[local21] || local16.aClass243_1 == arg0[local21].aClass243_2) {
						Static423.aBooleanArray40[local21] = true;
						local16.method6191();
						continue label71;
					}
				}
			}
			local16.method9043();
			this.anInt7726--;
			if (local16.method8752()) {
				local16.method8754();
				Static588.anInt9826--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt7726 != 8; local21++) {
			if (!Static423.aBooleanArray40[local21]) {
				@Pc(96) Class6_Sub2_Sub15 local96 = null;
				if (arg0[local21].method6506().anInt3360 == 1 && Static588.anInt9826 < 32) {
					local96 = new Class6_Sub2_Sub15(arg0[local21], this);
					Static400.aClass170_1.method4877((long) arg0[local21].anInt7535, local96);
					Static588.anInt9826++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub2_Sub15(arg0[local21], this);
				}
				this.aClass8_52.method157(local96);
				this.anInt7726++;
				Static423.aBooleanArray40[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(IZ)V")
	public void method6640(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static361.aClass81_6.method2119(this);
		this.aLong194 = (long) arg0;
		this.aLong193 = (long) arg0;
		this.aBoolean520 = true;
		this.aBoolean521 = arg1;
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
	public void method6641() {
		this.aBoolean519 = true;
		for (@Pc(8) Class6_Sub2_Sub15 local8 = (Class6_Sub2_Sub15) this.aClass8_52.method149(); local8 != null; local8 = (Class6_Sub2_Sub15) this.aClass8_52.method155()) {
			if (local8.aClass103_1.anInt3360 == 1) {
				local8.method8754();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass20_Sub6_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass20_Sub6_Sub1_Sub1Array1[local27] != null) {
				this.aClass20_Sub6_Sub1_Sub1Array1[local27].method7463();
				this.aClass20_Sub6_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt7724 = 0;
		this.aClass81_8 = new Class81();
		this.anInt7725 = 0;
		this.aClass8_52 = new Class8();
		this.anInt7726 = 0;
		this.method9004();
		Static385.aClass20_Sub8Array1[Static323.anInt6179] = this;
		Static323.anInt6179 = Static323.anInt6179 + 1 & Static296.anIntArray354[Static544.anInt9351];
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "()Lclient!of;")
	public Class236 method6642() {
		this.aClass236_1.aClass157_1.method4492();
		for (@Pc(6) int local6 = 0; local6 < this.aClass20_Sub6_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass20_Sub6_Sub1_Sub1Array1[local6] != null && this.aClass20_Sub6_Sub1_Sub1Array1[local6].aClass20_Sub7_1 != null) {
				this.aClass236_1.aClass157_1.method4487(this.aClass20_Sub6_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass236_1;
	}

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "()V")
	private void method6643() {
		this.aBoolean518 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method6644(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong194 == this.aLong193) {
			this.method6643();
		} else {
			this.method6633();
		}
		if (arg1 - this.aLong194 > 750L) {
			this.method6641();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong193);
		@Pc(36) Class20_Sub7 local36;
		if (this.aBoolean520) {
			for (local36 = (Class20_Sub7) this.aClass81_8.method2118(); local36 != null; local36 = (Class20_Sub7) this.aClass81_8.method2128()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass120_1.anInt3842; local39++) {
					local36.method5056(!this.aBoolean518, 1, arg0, arg1);
				}
			}
			this.aBoolean520 = false;
		}
		for (local36 = (Class20_Sub7) this.aClass81_8.method2118(); local36 != null; local36 = (Class20_Sub7) this.aClass81_8.method2128()) {
			local36.method5056(!this.aBoolean518, local27, arg0, arg1);
		}
		this.aLong193 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(J)V")
	public void method6645(@OriginalArg(0) long arg0) {
		this.aLong194 = arg0;
	}
}
