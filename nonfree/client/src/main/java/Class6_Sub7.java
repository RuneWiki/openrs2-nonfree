import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
	public int anInt7625;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
	public int anInt7627;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	public int anInt7628;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
	public int anInt7629;

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
	public int anInt7630;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "Z")
	public boolean aBoolean566 = false;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "Z")
	private boolean aBoolean567 = false;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public int anInt7623 = 0;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "Lclient!gu;")
	private Class107 aClass107_8 = new Class107();

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
	private int anInt7624 = 0;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Lclient!rk;")
	public Class249 aClass249_58 = new Class249();

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
	private int anInt7626 = 0;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "Lclient!oaa;")
	public final Class208 aClass208_1 = new Class208();

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "[Lclient!sv;")
	public final Class6_Sub1_Sub2_Sub1[] aClass6_Sub1_Sub2_Sub1Array2 = new Class6_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(I)V")
	public Class6_Sub7(@OriginalArg(0) int arg0) {
		this.method6395(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qa;)V")
	public void method6393(@OriginalArg(0) Class39 arg0) {
		this.aClass208_1.aClass210_1.method5354();
		for (@Pc(10) Class6_Sub6 local10 = (Class6_Sub6) this.aClass107_8.method2832(); local10 != null; local10 = (Class6_Sub6) this.aClass107_8.method2835()) {
			local10.method5164(arg0, this.aLong182);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method6394(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong183 == this.aLong182) {
			this.method6398();
		} else {
			this.method6406();
		}
		if (arg1 - this.aLong183 > 750L) {
			this.method6405();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong182);
		@Pc(36) Class6_Sub6 local36;
		if (this.aBoolean568) {
			for (local36 = (Class6_Sub6) this.aClass107_8.method2832(); local36 != null; local36 = (Class6_Sub6) this.aClass107_8.method2835()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass44_1.anInt1491; local39++) {
					local36.method5161(1, arg1, arg0, !this.aBoolean567);
				}
			}
			this.aBoolean568 = false;
		}
		for (local36 = (Class6_Sub6) this.aClass107_8.method2832(); local36 != null; local36 = (Class6_Sub6) this.aClass107_8.method2835()) {
			local36.method5161(local27, arg1, arg0, !this.aBoolean567);
		}
		this.aLong182 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
	public void method6395(@OriginalArg(0) int arg0) {
		Static218.aClass107_3.method2830(this);
		this.aLong183 = arg0;
		this.aLong182 = arg0;
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()V")
	public void method6396() {
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qa;J[Lclient!mm;[Lclient!kv;Z)V")
	public void method6397(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class192[] arg2, @OriginalArg(3) Class169[] arg3) {
		if (!this.aBoolean566) {
			this.method6404(arg0, arg2);
			this.method6399(arg3);
			this.aLong183 = arg1;
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "()V")
	private void method6398() {
		this.aBoolean567 = false;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([Lclient!kv;Z)V")
	private void method6399(@OriginalArg(0) Class169[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static406.aBooleanArray34[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub13_Sub9 local16 = (Class2_Sub13_Sub9) this.aClass249_58.method6527(); local16 != null; local16 = (Class2_Sub13_Sub9) this.aClass249_58.method6525()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass169_1 == arg0[local21] || local16.aClass169_1 == arg0[local21].aClass169_2) {
						Static406.aBooleanArray34[local21] = true;
						local16.method3973();
						continue label68;
					}
				}
			}
			local16.method7802();
			this.anInt7626--;
			if (local16.method7526()) {
				local16.method7527();
				Static293.anInt5392--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7626 != 8; local21++) {
			if (!Static406.aBooleanArray34[local21]) {
				@Pc(93) Class2_Sub13_Sub9 local93 = null;
				if (arg0[local21].method4056().anInt8378 == 1 && Static293.anInt5392 < 32) {
					local93 = new Class2_Sub13_Sub9(arg0[local21], this);
					Static367.aClass314_1.method7749(local93, (long) arg0[local21].anInt4678);
					Static293.anInt5392++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub13_Sub9(arg0[local21], this);
				}
				this.aClass249_58.method6523(local93);
				this.anInt7626++;
				Static406.aBooleanArray34[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "()Lclient!oaa;")
	public Class208 method6400() {
		return this.aClass208_1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(J)V")
	public void method6403(@OriginalArg(0) long arg0) {
		this.aLong183 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qa;[Lclient!mm;Z)V")
	private void method6404(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class192[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static406.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class6_Sub6 local16 = (Class6_Sub6) this.aClass107_8.method2832(); local16 != null; local16 = (Class6_Sub6) this.aClass107_8.method2835()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass192_2 == arg1[local21] || local16.aClass192_2 == arg1[local21].aClass192_1) {
						Static406.aBooleanArray33[local21] = true;
						local16.method5162();
						local16.aBoolean450 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6070 == 0) {
				local16.method7058();
				this.anInt7624--;
			} else {
				local16.aBoolean450 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7624 != 8; local21++) {
			if (!Static406.aBooleanArray33[local21]) {
				@Pc(101) Class6_Sub6 local101 = new Class6_Sub6(arg0, arg1[local21], this, this.aLong183);
				this.aClass107_8.method2830(local101);
				this.anInt7624++;
				Static406.aBooleanArray33[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "()V")
	public void method6405() {
		this.aBoolean566 = true;
		for (@Pc(8) Class2_Sub13_Sub9 local8 = (Class2_Sub13_Sub9) this.aClass249_58.method6527(); local8 != null; local8 = (Class2_Sub13_Sub9) this.aClass249_58.method6525()) {
			if (local8.aClass274_1.anInt8378 == 1) {
				local8.method7527();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass6_Sub1_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass6_Sub1_Sub2_Sub1Array2[local27] != null) {
				this.aClass6_Sub1_Sub2_Sub1Array2[local27].method6817();
				this.aClass6_Sub1_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt7623 = 0;
		this.aClass107_8 = new Class107();
		this.anInt7624 = 0;
		this.aClass249_58 = new Class249();
		this.anInt7626 = 0;
		this.method7058();
		Static16.aClass6_Sub7Array1[Static250.anInt4568] = this;
		Static250.anInt4568 = Static250.anInt4568 + 1 & Static538.anIntArray759[Static485.anInt8595];
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "()V")
	public void method6406() {
		this.aBoolean567 = true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIII)V")
	public void method6407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7630 = arg0;
		this.anInt7627 = arg1;
		this.anInt7629 = arg2;
		this.anInt7625 = arg3;
		this.anInt7628 = arg4;
	}
}
