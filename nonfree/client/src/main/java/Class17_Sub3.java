import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
	public int anInt1294;

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	public int anInt1296;

	@OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
	public int anInt1298;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
	public int anInt1292 = 0;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!um;")
	private Class204 aClass204_1 = new Class204();

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
	private int anInt1293 = 0;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Lclient!mk;")
	public Class130 aClass130_21 = new Class130();

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
	private int anInt1297 = 0;

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Lclient!hc;")
	public final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "[Lclient!vd;")
	public Class17_Sub7_Sub1_Sub1[] aClass17_Sub7_Sub1_Sub1Array1 = new Class17_Sub7_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class17_Sub3(@OriginalArg(0) int arg0) {
		Static140.aClass204_6.method5365(this);
		this.aLong52 = arg0;
		this.aLong53 = arg0;
		this.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(J)V")
	public void method1060(@OriginalArg(0) long arg0) {
		this.aLong52 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "()V")
	public void method1062() {
		this.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([Lclient!oa;Z)V")
	private void method1063(@OriginalArg(0) Class143[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static61.aBooleanArray9[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub1_Sub4 local16 = (Class4_Sub1_Sub4) this.aClass130_21.method3499(); local16 != null; local16 = (Class4_Sub1_Sub4) this.aClass130_21.method3512()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass143_1 == arg0[local21] || local16.aClass143_1 == arg0[local21].aClass143_2) {
						Static61.aBooleanArray9[local21] = true;
						local16.method670();
						continue label68;
					}
				}
			}
			local16.method5667();
			this.anInt1297--;
			if (local16.method5556()) {
				local16.method5555();
				Static251.anInt5212--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1297 != 8; local21++) {
			if (!Static61.aBooleanArray9[local21]) {
				@Pc(93) Class4_Sub1_Sub4 local93 = null;
				if (Static129.method2606(arg0[local21].anInt4557).anInt140 == 1 && Static251.anInt5212 < 32) {
					local93 = new Class4_Sub1_Sub4(arg0[local21], this);
					Static17.aClass58_1.method1255(local93, (long) arg0[local21].anInt4557);
					Static251.anInt5212++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub1_Sub4(arg0[local21], this);
				}
				this.aClass130_21.method3510(local93);
				this.anInt1297++;
				Static61.aBooleanArray9[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!vm;J[Lclient!md;[Lclient!oa;Z)V")
	public void method1064(@OriginalArg(0) Class92 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class125[] arg2, @OriginalArg(3) Class143[] arg3) {
		if (!this.aBoolean97) {
			this.method1069(arg0, arg2);
			this.method1063(arg3);
			this.aLong52 = arg1;
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "()V")
	public void method1065() {
		this.aBoolean97 = true;
		for (@Pc(8) Class4_Sub1_Sub4 local8 = (Class4_Sub1_Sub4) this.aClass130_21.method3499(); local8 != null; local8 = (Class4_Sub1_Sub4) this.aClass130_21.method3512()) {
			if (local8.aClass6_1.anInt140 == 1) {
				local8.method5555();
			}
		}
		this.aClass17_Sub7_Sub1_Sub1Array1 = new Class17_Sub7_Sub1_Sub1[8192];
		this.anInt1292 = 0;
		this.aClass204_1 = new Class204();
		this.anInt1293 = 0;
		this.aClass130_21 = new Class130();
		this.anInt1297 = 0;
		this.method5473();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!vm;J)Z")
	public boolean method1066(@OriginalArg(0) Class92 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong52 == this.aLong53) {
			this.method1072();
		} else {
			this.method1070();
		}
		if (arg1 - this.aLong52 > 750L) {
			this.method1065();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong53);
		@Pc(36) Class17_Sub5 local36;
		if (this.aBoolean98) {
			for (local36 = (Class17_Sub5) this.aClass204_1.method5359(); local36 != null; local36 = (Class17_Sub5) this.aClass204_1.method5357()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass91_1.anInt2498; local39++) {
					local36.method3166(arg1, 1, !this.aBoolean96, arg0);
				}
			}
			this.aBoolean98 = false;
		}
		for (local36 = (Class17_Sub5) this.aClass204_1.method5359(); local36 != null; local36 = (Class17_Sub5) this.aClass204_1.method5357()) {
			local36.method3166(arg1, local27, !this.aBoolean96, arg0);
		}
		this.aLong53 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "()Lclient!hc;")
	public Class88 method1067() {
		return this.aClass88_1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)V")
	public void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1294 = arg0;
		this.anInt1298 = arg1;
		this.anInt1296 = arg3;
		this.anInt1295 = arg4;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!vm;[Lclient!md;Z)V")
	private void method1069(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class125[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static61.aBooleanArray10[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class17_Sub5 local16 = (Class17_Sub5) this.aClass204_1.method5359(); local16 != null; local16 = (Class17_Sub5) this.aClass204_1.method5357()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass125_1 == arg1[local21] || local16.aClass125_1 == arg1[local21].aClass125_2) {
						Static61.aBooleanArray10[local21] = true;
						local16.method3167();
						local16.aBoolean308 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3705 == 0) {
				local16.method5473();
				this.anInt1293--;
			} else {
				local16.aBoolean308 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1293 != 8; local21++) {
			if (!Static61.aBooleanArray10[local21]) {
				@Pc(101) Class17_Sub5 local101 = new Class17_Sub5(arg0, arg1[local21], this, this.aLong52);
				this.aClass204_1.method5365(local101);
				this.anInt1293++;
				Static61.aBooleanArray10[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "()V")
	public void method1070() {
		this.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "()V")
	public void method1071() {
		this.aClass88_1.aClass114_1.method3154();
		for (@Pc(10) Class17_Sub5 local10 = (Class17_Sub5) this.aClass204_1.method5359(); local10 != null; local10 = (Class17_Sub5) this.aClass204_1.method5357()) {
			local10.method3163(this.aLong53);
		}
	}

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "()V")
	private void method1072() {
		this.aBoolean96 = false;
	}
}
