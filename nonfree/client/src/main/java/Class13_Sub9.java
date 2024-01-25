import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class13_Sub9 extends Class13 {

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
	public int anInt6675;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public int anInt6673 = 0;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "Lclient!jia;")
	private Class171 aClass171_5 = new Class171();

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
	private int anInt6674 = 0;

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "Lclient!fha;")
	public Class109 aClass109_42 = new Class109();

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
	private int anInt6676 = 0;

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "Z")
	public boolean aBoolean493 = false;

	@OriginalMember(owner = "client!pba", name = "t", descriptor = "Lclient!ev;")
	public final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "[Lclient!nk;")
	public final Class13_Sub3_Sub2_Sub1[] aClass13_Sub3_Sub2_Sub1Array1 = new Class13_Sub3_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IZ)V")
	public Class13_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5658(arg0, arg1);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
	private void method5646() {
		this.aBoolean491 = false;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5647(@OriginalArg(0) Class95 arg0) {
		this.aClass98_1.aClass220_1.method4639();
		for (@Pc(10) Class13_Sub10 local10 = (Class13_Sub10) this.aClass171_5.method3745(); local10 != null; local10 = (Class13_Sub10) this.aClass171_5.method3744()) {
			local10.method6041(this.aLong200, arg0);
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "()Lclient!ev;")
	public Class98 method5648() {
		this.aClass98_1.aClass220_1.method4639();
		for (@Pc(6) int local6 = 0; local6 < this.aClass13_Sub3_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass13_Sub3_Sub2_Sub1Array1[local6] != null && this.aClass13_Sub3_Sub2_Sub1Array1[local6].aClass13_Sub10_1 != null) {
				this.aClass98_1.aClass220_1.method4636(this.aClass13_Sub3_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass98_1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(J)V")
	public void method5649(@OriginalArg(0) long arg0) {
		this.aLong201 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "([Lclient!oo;Z)V")
	private void method5651(@OriginalArg(0) Class255[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static423.aBooleanArray123[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub2_Sub2 local16 = (Class2_Sub2_Sub2) this.aClass109_42.method2325(); local16 != null; local16 = (Class2_Sub2_Sub2) this.aClass109_42.method2318()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass255_1 == arg0[local21] || local16.aClass255_1 == arg0[local21].aClass255_2) {
						Static423.aBooleanArray123[local21] = true;
						local16.method241();
						continue label71;
					}
				}
			}
			local16.method8653();
			this.anInt6676--;
			if (local16.method8272()) {
				local16.method8271();
				Static475.anInt7604--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6676 != 8; local21++) {
			if (!Static423.aBooleanArray123[local21]) {
				@Pc(96) Class2_Sub2_Sub2 local96 = null;
				if (arg0[local21].method5515().anInt8526 == 1 && Static475.anInt7604 < 32) {
					local96 = new Class2_Sub2_Sub2(arg0[local21], this);
					Static2.aClass343_1.method7641(local96, (long) arg0[local21].anInt6393);
					Static475.anInt7604++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub2_Sub2(arg0[local21], this);
				}
				this.aClass109_42.method2323(local96);
				this.anInt6676++;
				Static423.aBooleanArray123[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "()V")
	public void method5652() {
		this.aBoolean492 = true;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5653(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong201 == this.aLong200) {
			this.method5646();
		} else {
			this.method5657();
		}
		if (arg1 - this.aLong201 > 750L) {
			this.method5661();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong200);
		@Pc(36) Class13_Sub10 local36;
		if (this.aBoolean492) {
			for (local36 = (Class13_Sub10) this.aClass171_5.method3745(); local36 != null; local36 = (Class13_Sub10) this.aClass171_5.method3744()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass259_1.anInt6493; local39++) {
					local36.method6039(!this.aBoolean491, 1, arg1, arg0);
				}
			}
			this.aBoolean492 = false;
		}
		for (local36 = (Class13_Sub10) this.aClass171_5.method3745(); local36 != null; local36 = (Class13_Sub10) this.aClass171_5.method3744()) {
			local36.method6039(!this.aBoolean491, local27, arg1, arg0);
		}
		this.aLong200 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;[Lclient!hr;Z)V")
	private void method5654(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class143[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static423.aBooleanArray122[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class13_Sub10 local16 = (Class13_Sub10) this.aClass171_5.method3745(); local16 != null; local16 = (Class13_Sub10) this.aClass171_5.method3744()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass143_2 == arg1[local21] || local16.aClass143_2 == arg1[local21].aClass143_1) {
						Static423.aBooleanArray122[local21] = true;
						local16.method6043();
						local16.aBoolean533 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7090 == 0) {
				local16.method8394();
				this.anInt6674--;
			} else {
				local16.aBoolean533 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6674 != 32; local21++) {
			if (!Static423.aBooleanArray122[local21]) {
				@Pc(104) Class13_Sub10 local104 = new Class13_Sub10(arg0, arg1[local21], this, this.aLong201);
				this.aClass171_5.method3746(local104);
				this.anInt6674++;
				Static423.aBooleanArray122[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V")
	public void method5655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6675 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "()V")
	public void method5657() {
		this.aBoolean491 = true;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(IZ)V")
	public void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static82.aClass171_1.method3746(this);
		this.aLong201 = arg0;
		this.aLong200 = arg0;
		this.aBoolean492 = true;
		this.aBoolean493 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;J[Lclient!hr;[Lclient!oo;Z)V")
	public void method5659(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class143[] arg2, @OriginalArg(3) Class255[] arg3) {
		if (!this.aBoolean490) {
			this.method5654(arg0, arg2);
			this.method5651(arg3);
			this.aLong201 = arg1;
		}
	}

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "()Lclient!ev;")
	public Class98 method5660() {
		return this.aClass98_1;
	}

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "()V")
	public void method5661() {
		this.aBoolean490 = true;
		for (@Pc(8) Class2_Sub2_Sub2 local8 = (Class2_Sub2_Sub2) this.aClass109_42.method2325(); local8 != null; local8 = (Class2_Sub2_Sub2) this.aClass109_42.method2318()) {
			if (local8.aClass312_1.anInt8526 == 1) {
				local8.method8271();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass13_Sub3_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass13_Sub3_Sub2_Sub1Array1[local27] != null) {
				this.aClass13_Sub3_Sub2_Sub1Array1[local27].method5098();
				this.aClass13_Sub3_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt6673 = 0;
		this.aClass171_5 = new Class171();
		this.anInt6674 = 0;
		this.aClass109_42 = new Class109();
		this.anInt6676 = 0;
		this.method8394();
		Static382.aClass13_Sub9Array1[Static7.anInt93] = this;
		Static7.anInt93 = Static7.anInt93 + 1 & Static215.anIntArray237[Static504.anInt8146];
	}
}
