import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public int anInt1429;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public int anInt1427 = 0;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!jg;")
	private Class128 aClass128_3 = new Class128();

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	private int anInt1428 = 0;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!ft;")
	public Class88 aClass88_16 = new Class88();

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	private int anInt1431 = 0;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!ii;")
	public final Class115 aClass115_1 = new Class115();

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lclient!hu;")
	public Class48_Sub2_Sub1_Sub1[] aClass48_Sub2_Sub1_Sub1Array2 = new Class48_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
	public Class48_Sub1(@OriginalArg(0) int arg0) {
		Static62.aClass128_2.method2833(this);
		this.aLong47 = arg0;
		this.aLong48 = arg0;
		this.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qq;J)Z")
	public boolean method1287(@OriginalArg(0) Class28 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong47 == this.aLong48) {
			this.method1299();
		} else {
			this.method1289();
		}
		if (arg1 - this.aLong47 > 750L) {
			this.method1292();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong48);
		@Pc(36) Class48_Sub3 local36;
		if (this.aBoolean124) {
			for (local36 = (Class48_Sub3) this.aClass128_3.method2831(); local36 != null; local36 = (Class48_Sub3) this.aClass128_3.method2832()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass245_1.anInt6851; local39++) {
					local36.method2189(arg1, 1, arg0, !this.aBoolean122);
				}
			}
			this.aBoolean124 = false;
		}
		for (local36 = (Class48_Sub3) this.aClass128_3.method2831(); local36 != null; local36 = (Class48_Sub3) this.aClass128_3.method2832()) {
			local36.method2189(arg1, local27, arg0, !this.aBoolean122);
		}
		this.aLong48 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qq;[Lclient!oo;Z)V")
	private void method1288(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class192[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static68.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class48_Sub3 local16 = (Class48_Sub3) this.aClass128_3.method2831(); local16 != null; local16 = (Class48_Sub3) this.aClass128_3.method2832()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass192_1 == arg1[local21] || local16.aClass192_1 == arg1[local21].aClass192_2) {
						Static68.aBooleanArray6[local21] = true;
						local16.method2190();
						local16.aBoolean180 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt2383 == 0) {
				local16.method5436();
				this.anInt1428--;
			} else {
				local16.aBoolean180 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1428 != 8; local21++) {
			if (!Static68.aBooleanArray6[local21]) {
				@Pc(101) Class48_Sub3 local101 = new Class48_Sub3(arg0, arg1[local21], this, this.aLong47);
				this.aClass128_3.method2833(local101);
				this.anInt1428++;
				Static68.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
	public void method1289() {
		this.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qq;J[Lclient!oo;[Lclient!ma;Z)V")
	public void method1290(@OriginalArg(0) Class28 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class192[] arg2, @OriginalArg(3) Class161[] arg3) {
		if (!this.aBoolean123) {
			this.method1288(arg0, arg2);
			this.method1291(arg3);
			this.aLong47 = arg1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lclient!ma;Z)V")
	private void method1291(@OriginalArg(0) Class161[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static68.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class6_Sub1_Sub16 local16 = (Class6_Sub1_Sub16) this.aClass88_16.method1882(); local16 != null; local16 = (Class6_Sub1_Sub16) this.aClass88_16.method1891()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass161_2 == arg0[local21] || local16.aClass161_2 == arg0[local21].aClass161_1) {
						Static68.aBooleanArray7[local21] = true;
						local16.method5071();
						continue label68;
					}
				}
			}
			local16.method5977();
			this.anInt1431--;
			if (local16.method5982()) {
				local16.method5984();
				Static3.anInt6328--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1431 != 8; local21++) {
			if (!Static68.aBooleanArray7[local21]) {
				@Pc(93) Class6_Sub1_Sub16 local93 = null;
				if (arg0[local21].method3710().anInt4156 == 1 && Static3.anInt6328 < 32) {
					local93 = new Class6_Sub1_Sub16(arg0[local21], this);
					Static35.aClass135_1.method3149(local93, (long) arg0[local21].anInt4065);
					Static3.anInt6328++;
				}
				if (local93 == null) {
					local93 = new Class6_Sub1_Sub16(arg0[local21], this);
				}
				this.aClass88_16.method1878(local93);
				this.anInt1431++;
				Static68.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()V")
	public void method1292() {
		this.aBoolean123 = true;
		for (@Pc(8) Class6_Sub1_Sub16 local8 = (Class6_Sub1_Sub16) this.aClass88_16.method1882(); local8 != null; local8 = (Class6_Sub1_Sub16) this.aClass88_16.method1891()) {
			if (local8.aClass168_1.anInt4156 == 1) {
				local8.method5984();
			}
		}
		this.aClass48_Sub2_Sub1_Sub1Array2 = new Class48_Sub2_Sub1_Sub1[8192];
		this.anInt1427 = 0;
		this.aClass128_3 = new Class128();
		this.anInt1428 = 0;
		this.aClass88_16 = new Class88();
		this.anInt1431 = 0;
		this.method5436();
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()Lclient!ii;")
	public Class115 method1293() {
		return this.aClass115_1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public void method1294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1434 = arg0;
		this.anInt1432 = arg1;
		this.anInt1429 = arg2;
		this.anInt1430 = arg3;
		this.anInt1433 = arg4;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()V")
	public void method1295() {
		this.aClass115_1.aClass246_1.method5593();
		for (@Pc(10) Class48_Sub3 local10 = (Class48_Sub3) this.aClass128_3.method2831(); local10 != null; local10 = (Class48_Sub3) this.aClass128_3.method2832()) {
			local10.method2188(this.aLong48);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(J)V")
	public void method1297(@OriginalArg(0) long arg0) {
		this.aLong47 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "()V")
	public void method1298() {
		this.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "()V")
	private void method1299() {
		this.aBoolean122 = false;
	}
}
