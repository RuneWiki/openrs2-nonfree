import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	public int anInt2642;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	public int anInt2640 = 0;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "Lclient!sc;")
	private Class208 aClass208_7 = new Class208();

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
	private int anInt2641 = 0;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Lclient!at;")
	public Class17 aClass17_26 = new Class17();

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	private int anInt2646 = 0;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Lclient!im;")
	public final Class108 aClass108_1 = new Class108();

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[Lclient!wk;")
	public Class41_Sub2_Sub1_Sub1[] aClass41_Sub2_Sub1_Sub1Array1 = new Class41_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
	public Class41_Sub3(@OriginalArg(0) int arg0) {
		Static63.aClass208_8.method4664(this);
		this.aLong76 = arg0;
		this.aLong75 = arg0;
		this.aBoolean227 = true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([Lclient!am;Z)V")
	private void method2139(@OriginalArg(0) Class12[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static141.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub6_Sub12 local16 = (Class1_Sub6_Sub12) this.aClass17_26.method202(); local16 != null; local16 = (Class1_Sub6_Sub12) this.aClass17_26.method207()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass12_2 == arg0[local21] || local16.aClass12_2 == arg0[local21].aClass12_1) {
						Static141.aBooleanArray13[local21] = true;
						local16.method4144();
						continue label68;
					}
				}
			}
			local16.method5577();
			this.anInt2646--;
			if (local16.method5579()) {
				local16.method5580();
				Static390.anInt6363--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt2646 != 8; local21++) {
			if (!Static141.aBooleanArray13[local21]) {
				@Pc(93) Class1_Sub6_Sub12 local93 = null;
				if (Static236.method3258(arg0[local21].anInt187).anInt2091 == 1 && Static390.anInt6363 < 32) {
					local93 = new Class1_Sub6_Sub12(arg0[local21], this);
					Static68.aClass89_1.method1698((long) arg0[local21].anInt187, local93);
					Static390.anInt6363++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub6_Sub12(arg0[local21], this);
				}
				this.aClass17_26.method199(local93);
				this.anInt2646++;
				Static141.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()V")
	public void method2140() {
		this.aBoolean225 = true;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()V")
	public void method2141() {
		this.aClass108_1.aClass95_1.method1837();
		for (@Pc(10) Class41_Sub7 local10 = (Class41_Sub7) this.aClass208_7.method4661(); local10 != null; local10 = (Class41_Sub7) this.aClass208_7.method4663()) {
			local10.method5444(this.aLong75);
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()V")
	public void method2142() {
		this.aBoolean227 = true;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()Lclient!im;")
	public Class108 method2143() {
		return this.aClass108_1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!tq;J)Z")
	public boolean method2144(@OriginalArg(0) Class164 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong76 == this.aLong75) {
			this.method2151();
		} else {
			this.method2140();
		}
		if (arg1 - this.aLong76 > 750L) {
			this.method2149();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong75);
		@Pc(36) Class41_Sub7 local36;
		if (this.aBoolean227) {
			for (local36 = (Class41_Sub7) this.aClass208_7.method4661(); local36 != null; local36 = (Class41_Sub7) this.aClass208_7.method4663()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass204_1.anInt5331; local39++) {
					local36.method5443(1, arg0, arg1, !this.aBoolean225);
				}
			}
			this.aBoolean227 = false;
		}
		for (local36 = (Class41_Sub7) this.aClass208_7.method4661(); local36 != null; local36 = (Class41_Sub7) this.aClass208_7.method4663()) {
			local36.method5443(local27, arg0, arg1, !this.aBoolean225);
		}
		this.aLong75 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!tq;[Lclient!qt;Z)V")
	private void method2146(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class197[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static141.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class41_Sub7 local16 = (Class41_Sub7) this.aClass208_7.method4661(); local16 != null; local16 = (Class41_Sub7) this.aClass208_7.method4663()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass197_2 == arg1[local21] || local16.aClass197_2 == arg1[local21].aClass197_1) {
						Static141.aBooleanArray12[local21] = true;
						local16.method5441();
						local16.aBoolean577 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6233 == 0) {
				local16.method5475();
				this.anInt2641--;
			} else {
				local16.aBoolean577 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt2641 != 8; local21++) {
			if (!Static141.aBooleanArray12[local21]) {
				@Pc(101) Class41_Sub7 local101 = new Class41_Sub7(arg0, arg1[local21], this, this.aLong76);
				this.aClass208_7.method4664(local101);
				this.anInt2641++;
				Static141.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIIII)V")
	public void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2643 = arg0;
		this.anInt2647 = arg1;
		this.anInt2642 = arg2;
		this.anInt2645 = arg3;
		this.anInt2644 = arg4;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(J)V")
	public void method2148(@OriginalArg(0) long arg0) {
		this.aLong76 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "()V")
	public void method2149() {
		this.aBoolean226 = true;
		for (@Pc(8) Class1_Sub6_Sub12 local8 = (Class1_Sub6_Sub12) this.aClass17_26.method202(); local8 != null; local8 = (Class1_Sub6_Sub12) this.aClass17_26.method207()) {
			if (local8.aClass91_1.anInt2091 == 1) {
				local8.method5580();
			}
		}
		this.aClass41_Sub2_Sub1_Sub1Array1 = new Class41_Sub2_Sub1_Sub1[8192];
		this.anInt2640 = 0;
		this.aClass208_7 = new Class208();
		this.anInt2641 = 0;
		this.aClass17_26 = new Class17();
		this.anInt2646 = 0;
		this.method5475();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!tq;J[Lclient!qt;[Lclient!am;Z)V")
	public void method2150(@OriginalArg(0) Class164 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class197[] arg2, @OriginalArg(3) Class12[] arg3) {
		if (!this.aBoolean226) {
			this.method2146(arg0, arg2);
			this.method2139(arg3);
			this.aLong76 = arg1;
		}
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "()V")
	private void method2151() {
		this.aBoolean225 = false;
	}
}
