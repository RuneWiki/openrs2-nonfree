import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class164 {

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
	public int anInt4241;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "Lclient!ka;")
	private final Class132 aClass132_38 = new Class132(64);

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "Lclient!ka;")
	public final Class132 aClass132_39 = new Class132(50);

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "Lclient!it;")
	public final Class119 aClass119_1 = new Class119(250);

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "Lclient!go;")
	private final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!dk;")
	public final Class54 aClass54_75;

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "Lclient!ke;")
	private final Class135 aClass135_2;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	public final int anInt4234;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "Lclient!dk;")
	private final Class54 aClass54_74;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public final int anInt4231;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray25;

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray26;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!ad;IZLclient!ke;Lclient!dk;Lclient!dk;)V")
	public Class164(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class135 arg3, @OriginalArg(4) Class54 arg4, @OriginalArg(5) Class54 arg5) {
		this.aClass54_75 = arg5;
		this.aClass135_2 = arg3;
		this.anInt4234 = arg1;
		this.aBoolean298 = arg2;
		this.aClass54_74 = arg4;
		if (this.aClass54_74 == null) {
			this.anInt4231 = 0;
		} else {
			@Pc(54) int local54 = this.aClass54_74.method1107() - 1;
			this.anInt4231 = this.aClass54_74.method1123(local54) + local54 * 256;
		}
		this.aStringArray25 = new String[] { null, null, Static332.aClass134_77.method2720(this.anInt4234), null, null };
		this.aStringArray26 = new String[] { null, null, null, null, Static4.aClass134_5.method2720(this.anInt4234) };
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!za;Lclient!ur;BIIIII)Lclient!o;")
	public Class13 method3453(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass90_1.anInt2434 = arg5;
		this.aClass90_1.anInt2436 = arg6;
		this.aClass90_1.anInt2435 = arg0.anInt7061;
		this.aClass90_1.anInt2441 = arg4;
		this.aClass90_1.aBoolean161 = arg1 != null;
		this.aClass90_1.anInt2433 = arg3;
		this.aClass90_1.anInt2439 = arg2;
		return (Class13) this.aClass119_1.method2499(this.aClass90_1);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
	public void method3454(@OriginalArg(1) int arg0) {
		this.anInt4241 = arg0;
		@Pc(13) Class132 local13 = this.aClass132_39;
		synchronized (this.aClass132_39) {
			this.aClass132_39.method2698();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!za;IZILclient!za;IZIIILclient!la;Lclient!ur;)Lclient!o;")
	public Class13 method3455(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class92 arg9, @OriginalArg(11) Class249 arg10) {
		@Pc(16) Class13 local16 = this.method3453(arg0, arg10, arg3, arg1, arg8, arg7, arg5);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class208 local25 = this.method3458(arg7);
		if (arg8 > 1 && local25.anIntArray498 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local25.anIntArray499[local35] && local25.anIntArray499[local35] != 0) {
					local33 = local25.anIntArray498[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method3458(local33);
			}
		}
		@Pc(88) int[] local88 = local25.method4481(arg5, arg4, arg0, arg2, arg10, arg1, arg3, arg9, arg8);
		if (local88 == null) {
			return null;
		}
		@Pc(102) Class13 local102;
		if (arg6) {
			local102 = arg4.method5522(local88, 36, 36, 32);
		} else {
			local102 = arg0.method5522(local88, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(118) Class90 local118 = new Class90();
			local118.aBoolean161 = arg10 != null;
			local118.anInt2441 = arg8;
			local118.anInt2433 = arg1;
			local118.anInt2436 = arg5;
			local118.anInt2435 = arg0.anInt7061;
			local118.anInt2439 = arg3;
			local118.anInt2434 = arg7;
			this.aClass119_1.method2502(local102, local118);
		}
		return local102;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZZ)V")
	public void method3456(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean298) {
			this.aBoolean298 = arg0;
			this.method3457();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public void method3457() {
		@Pc(2) Class132 local2 = this.aClass132_38;
		synchronized (this.aClass132_38) {
			this.aClass132_38.method2698();
		}
		local2 = this.aClass132_39;
		synchronized (this.aClass132_39) {
			this.aClass132_39.method2698();
		}
		@Pc(44) Class119 local44 = this.aClass119_1;
		synchronized (this.aClass119_1) {
			this.aClass119_1.method2501();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lclient!qt;")
	public Class208 method3458(@OriginalArg(0) int arg0) {
		@Pc(8) Class132 local8 = this.aClass132_38;
		@Pc(18) Class208 local18;
		synchronized (this.aClass132_38) {
			local18 = (Class208) this.aClass132_38.method2701((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class54 local31 = this.aClass54_74;
		@Pc(44) byte[] local44;
		synchronized (this.aClass54_74) {
			local44 = this.aClass54_74.method1126(Static372.method4849(arg0), Static406.method5146(arg0));
		}
		local18 = new Class208();
		local18.anInt5668 = arg0;
		local18.aClass164_1 = this;
		local18.aStringArray33 = new String[] { null, null, Static332.aClass134_77.method2720(this.anInt4234), null, null };
		local18.aStringArray34 = new String[] { null, null, null, null, Static4.aClass134_5.method2720(this.anInt4234) };
		if (local44 != null) {
			local18.method4485(new Class2_Sub13(local44));
		}
		local18.method4480();
		if (local18.anInt5683 != -1) {
			local18.method4474(this.method3458(local18.anInt5701), this.method3458(local18.anInt5683));
		}
		if (local18.anInt5680 != -1) {
			local18.method4479(this.method3458(local18.anInt5709), this.method3458(local18.anInt5680));
		}
		if (!this.aBoolean298 && local18.aBoolean420) {
			local18.lb = Static136.aClass134_47.method2720(this.anInt4234);
			local18.anIntArray500 = null;
			local18.anInt5686 = 0;
			local18.aBoolean421 = false;
			local18.aStringArray34 = this.aStringArray26;
			local18.aStringArray33 = this.aStringArray25;
			if (local18.aClass72_36 != null) {
				@Pc(207) boolean local207 = false;
				for (@Pc(212) Class2 local212 = local18.aClass72_36.method1655(); local212 != null; local212 = local18.aClass72_36.method1649()) {
					@Pc(222) Class200 local222 = this.aClass135_2.method2749((int) local212.aLong225);
					if (local222.aBoolean410) {
						local212.method5703();
					} else {
						local207 = true;
					}
				}
				if (!local207) {
					local18.aClass72_36 = null;
				}
			}
		}
		@Pc(247) Class132 local247 = this.aClass132_38;
		synchronized (this.aClass132_38) {
			this.aClass132_38.method2711(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public void method3459() {
		@Pc(2) Class132 local2 = this.aClass132_38;
		synchronized (this.aClass132_38) {
			this.aClass132_38.method2708();
		}
		local2 = this.aClass132_39;
		synchronized (this.aClass132_39) {
			this.aClass132_39.method2708();
		}
		@Pc(42) Class119 local42 = this.aClass119_1;
		synchronized (this.aClass119_1) {
			this.aClass119_1.method2498();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public void method3461() {
		@Pc(16) Class132 local16 = this.aClass132_39;
		synchronized (this.aClass132_39) {
			this.aClass132_39.method2698();
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
	public void method3462() {
		@Pc(2) Class119 local2 = this.aClass119_1;
		synchronized (this.aClass119_1) {
			this.aClass119_1.method2501();
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V")
	public void method3463() {
		@Pc(2) Class132 local2 = this.aClass132_38;
		synchronized (this.aClass132_38) {
			this.aClass132_38.method2713(5);
		}
		local2 = this.aClass132_39;
		synchronized (this.aClass132_39) {
			this.aClass132_39.method2713(5);
		}
		@Pc(40) Class119 local40 = this.aClass119_1;
		synchronized (this.aClass119_1) {
			this.aClass119_1.method2493();
		}
	}
}
