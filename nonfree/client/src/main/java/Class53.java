import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class53 {

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public int anInt1797;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!fba;")
	private final Class102 aClass102_8 = new Class102(64);

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "Lclient!fba;")
	public final Class102 aClass102_9 = new Class102(50);

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "Lclient!faa;")
	public final Class100 aClass100_1 = new Class100(250);

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "Lclient!cd;")
	private final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Lclient!cn;")
	private final Class55 aClass55_1;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "Lclient!la;")
	private final Class196 aClass196_23;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public final int anInt1781;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!la;")
	public final Class196 aClass196_22;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public final int anInt1780;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray6;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!mp;IZLclient!cn;Lclient!la;Lclient!la;)V")
	public Class53(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) Class196 arg4, @OriginalArg(5) Class196 arg5) {
		this.aClass55_1 = arg3;
		this.aClass196_23 = arg4;
		this.anInt1781 = arg1;
		this.aBoolean107 = arg2;
		this.aClass196_22 = arg5;
		if (this.aClass196_23 == null) {
			this.anInt1780 = 0;
		} else {
			@Pc(54) int local54 = this.aClass196_23.method5125() - 1;
			this.anInt1780 = this.aClass196_23.method5118(local54) + local54 * 256;
		}
		this.aStringArray6 = new String[] { null, null, Static59.aClass43_7.method1598(this.anInt1781), null, null };
		this.aStringArray5 = new String[] { null, null, null, null, Static59.aClass43_8.method1598(this.anInt1781) };
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V")
	public void method1767(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean107 != arg0) {
			this.aBoolean107 = arg0;
			this.method1769();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1769() {
		@Pc(6) Class102 local6 = this.aClass102_8;
		synchronized (this.aClass102_8) {
			this.aClass102_8.method2681();
		}
		local6 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2681();
		}
		@Pc(40) Class100 local40 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2649();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lclient!br;")
	public Class38 method1770(@OriginalArg(0) int arg0) {
		@Pc(8) Class102 local8 = this.aClass102_8;
		@Pc(18) Class38 local18;
		synchronized (this.aClass102_8) {
			local18 = (Class38) this.aClass102_8.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class196 local31 = this.aClass196_23;
		@Pc(44) byte[] local44;
		synchronized (this.aClass196_23) {
			local44 = this.aClass196_23.method5102(Static367.method5978(arg0), Static374.method6034(arg0));
		}
		local18 = new Class38();
		local18.anInt1437 = arg0;
		local18.aClass53_1 = this;
		local18.aStringArray2 = new String[] { null, null, Static59.aClass43_7.method1598(this.anInt1781), null, null };
		local18.aStringArray3 = new String[] { null, null, null, null, Static59.aClass43_8.method1598(this.anInt1781) };
		if (local44 != null) {
			local18.method1489(new Class3_Sub3(local44));
		}
		local18.method1492();
		if (local18.anInt1487 != -1) {
			local18.method1493(this.method1770(local18.anInt1452), this.method1770(local18.anInt1487));
		}
		if (local18.anInt1457 != -1) {
			local18.method1490(this.method1770(local18.anInt1457), this.method1770(local18.anInt1473));
		}
		if (!this.aBoolean107 && local18.aBoolean96) {
			local18.aString6 = Static59.aClass43_5.method1598(this.anInt1781);
			local18.aStringArray2 = this.aStringArray6;
			local18.anIntArray50 = null;
			local18.anInt1467 = 0;
			local18.aStringArray3 = this.aStringArray5;
			local18.aBoolean95 = false;
			if (local18.aClass280_2 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class3 local209 = local18.aClass280_2.method7110(); local209 != null; local209 = local18.aClass280_2.method7108()) {
					@Pc(219) Class300 local219 = this.aClass55_1.method1843((int) local209.aLong276);
					if (local219.aBoolean614) {
						local209.method8769();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass280_2 = null;
				}
			}
		}
		@Pc(244) Class102 local244 = this.aClass102_8;
		synchronized (this.aClass102_8) {
			this.aClass102_8.method2674((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILclient!jr;IILclient!ha;I)Lclient!td;")
	public Class24 method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		this.aClass45_1.anInt1650 = arg4;
		this.aClass45_1.anInt1653 = arg3;
		this.aClass45_1.anInt1656 = arg6;
		this.aClass45_1.anInt1652 = arg1;
		this.aClass45_1.aBoolean100 = arg2 != null;
		this.aClass45_1.anInt1657 = arg0;
		this.aClass45_1.anInt1655 = arg5.anInt8747;
		return (Class24) this.aClass100_1.method2657(this.aClass45_1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!da;IIIILclient!jr;Lclient!ha;Lclient!ha;ZBIZ)Lclient!td;")
	public Class24 method1774(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class178 arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(18) Class24 local18 = this.method1772(arg3, arg4, arg5, arg9, arg2, arg7, arg1);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) Class38 local29 = this.method1770(arg1);
		if (arg4 > 1 && local29.anIntArray51 != null) {
			@Pc(43) int local43 = -1;
			for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
				if (arg4 >= local29.anIntArray49[local45] && local29.anIntArray49[local45] != 0) {
					local43 = local29.anIntArray51[local45];
				}
			}
			if (local43 != -1) {
				local29 = this.method1770(local43);
			}
		}
		@Pc(93) int[] local93 = local29.method1487(arg10, arg2, arg6, arg3, arg4, arg5, arg9, arg0, arg7);
		if (local93 == null) {
			return null;
		}
		@Pc(108) Class24 local108;
		if (arg8) {
			local108 = arg6.method7536(local93, 32, 36, 36);
		} else {
			local108 = arg7.method7536(local93, 32, 36, 36);
		}
		if (!arg8) {
			@Pc(125) Class45 local125 = new Class45();
			local125.anInt1653 = arg9;
			local125.anInt1650 = arg2;
			local125.anInt1656 = arg1;
			local125.anInt1652 = arg4;
			local125.anInt1655 = arg7.anInt8747;
			local125.aBoolean100 = arg5 != null;
			local125.anInt1657 = arg3;
			this.aClass100_1.method2660(local125, local108);
		}
		return local108;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public void method1775() {
		@Pc(2) Class100 local2 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2649();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	public void method1776(@OriginalArg(0) int arg0) {
		this.anInt1797 = arg0;
		@Pc(14) Class102 local14 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2681();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	public void method1777() {
		@Pc(6) Class102 local6 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2681();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
	public void method1780() {
		@Pc(2) Class102 local2 = this.aClass102_8;
		synchronized (this.aClass102_8) {
			this.aClass102_8.method2668(5);
		}
		local2 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2668(5);
		}
		@Pc(45) Class100 local45 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2655();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
	public void method1782() {
		@Pc(6) Class102 local6 = this.aClass102_8;
		synchronized (this.aClass102_8) {
			this.aClass102_8.method2680();
		}
		local6 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2680();
		}
		@Pc(44) Class100 local44 = this.aClass100_1;
		synchronized (this.aClass100_1) {
			this.aClass100_1.method2654();
		}
	}
}
