import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class370 {

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
	public int anInt10169;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!jda;")
	private final Class165 aClass165_75 = new Class165(64);

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "Lclient!jda;")
	public final Class165 aClass165_76 = new Class165(50);

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!js;")
	public final Class176 aClass176_1 = new Class176(250);

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Lclient!wj;")
	private final Class388 aClass388_1 = new Class388();

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public final int anInt10156;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "Lclient!aj;")
	public final Class15 aClass15_158;

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "Lclient!vfa;")
	private final Class367 aClass367_2;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!aj;")
	private final Class15 aClass15_157;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Z")
	private boolean aBoolean769;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
	public final int anInt10161;

	@OriginalMember(owner = "client!vk", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray38;

	@OriginalMember(owner = "client!vk", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!gia;IZLclient!vfa;Lclient!aj;Lclient!aj;)V")
	public Class370(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class367 arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) Class15 arg5) {
		this.anInt10156 = arg1;
		this.aClass15_158 = arg5;
		this.aClass367_2 = arg3;
		this.aClass15_157 = arg4;
		this.aBoolean769 = arg2;
		if (this.aClass15_157 == null) {
			this.anInt10161 = 0;
		} else {
			@Pc(54) int local54 = this.aClass15_157.method516() - 1;
			this.anInt10161 = this.aClass15_157.method512(local54) + local54 * 256;
		}
		this.aStringArray38 = new String[] { null, null, Static601.aClass346_10.method8440(this.anInt10156), null, null };
		this.aStringArray39 = new String[] { null, null, null, null, Static601.aClass346_11.method8440(this.anInt10156) };
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
	public void method8897() {
		@Pc(6) Class165 local6 = this.aClass165_75;
		synchronized (this.aClass165_75) {
			this.aClass165_75.method4394(5);
		}
		local6 = this.aClass165_76;
		synchronized (this.aClass165_76) {
			this.aClass165_76.method4394(5);
		}
		@Pc(44) Class176 local44 = this.aClass176_1;
		synchronized (this.aClass176_1) {
			this.aClass176_1.method4539();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	public void method8898() {
		@Pc(6) Class165 local6 = this.aClass165_75;
		synchronized (this.aClass165_75) {
			this.aClass165_75.method4400();
		}
		local6 = this.aClass165_76;
		synchronized (this.aClass165_76) {
			this.aClass165_76.method4400();
		}
		@Pc(50) Class176 local50 = this.aClass176_1;
		synchronized (this.aClass176_1) {
			this.aClass176_1.method4547();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V")
	public void method8899(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean769 != arg0) {
			this.aBoolean769 = arg0;
			this.method8901();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!vw;")
	public Class374 method8900(@OriginalArg(1) int arg0) {
		@Pc(16) Class165 local16 = this.aClass165_75;
		@Pc(26) Class374 local26;
		synchronized (this.aClass165_75) {
			local26 = (Class374) this.aClass165_75.method4389((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(39) Class15 local39 = this.aClass15_157;
		@Pc(52) byte[] local52;
		synchronized (this.aClass15_157) {
			local52 = this.aClass15_157.method517(Static580.method8162(arg0), Static206.method3611(arg0));
		}
		local26 = new Class374();
		local26.aClass370_2 = this;
		local26.anInt10288 = arg0;
		local26.aStringArray40 = new String[] { null, null, Static601.aClass346_10.method8440(this.anInt10156), null, null };
		local26.aStringArray41 = new String[] { null, null, null, null, Static601.aClass346_11.method8440(this.anInt10156) };
		if (local52 != null) {
			local26.method9007(new Class3_Sub25(local52));
		}
		local26.method9010();
		if (local26.anInt10284 != -1) {
			local26.method8998(this.method8900(local26.anInt10284), this.method8900(local26.anInt10339));
		}
		if (local26.anInt10299 != -1) {
			local26.method9005(this.method8900(local26.anInt10327), this.method8900(local26.anInt10299));
		}
		if (local26.anInt10306 != -1) {
			local26.method9000(this.method8900(local26.anInt10282), this.method8900(local26.anInt10306));
		}
		if (!this.aBoolean769 && local26.aBoolean776) {
			local26.aString121 = Static601.aClass346_7.method8440(this.anInt10156);
			local26.aStringArray41 = this.aStringArray39;
			local26.anInt10331 = 0;
			local26.aBoolean777 = false;
			local26.anIntArray908 = null;
			local26.aStringArray40 = this.aStringArray38;
			if (local26.aClass83_46 != null) {
				@Pc(224) boolean local224 = false;
				for (@Pc(229) Class3 local229 = local26.aClass83_46.method2375(); local229 != null; local229 = local26.aClass83_46.method2370()) {
					@Pc(239) Class322 local239 = this.aClass367_2.method8812((int) local229.aLong311);
					if (local239.aBoolean707) {
						local229.method9380();
					} else {
						local224 = true;
					}
				}
				if (!local224) {
					local26.aClass83_46 = null;
				}
			}
		}
		@Pc(264) Class165 local264 = this.aClass165_75;
		synchronized (this.aClass165_75) {
			this.aClass165_75.method4392(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method8901() {
		@Pc(2) Class165 local2 = this.aClass165_75;
		synchronized (this.aClass165_75) {
			this.aClass165_75.method4403();
		}
		local2 = this.aClass165_76;
		synchronized (this.aClass165_76) {
			this.aClass165_76.method4403();
		}
		@Pc(36) Class176 local36 = this.aClass176_1;
		synchronized (this.aClass176_1) {
			this.aClass176_1.method4540();
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
	public void method8902() {
		@Pc(2) Class176 local2 = this.aClass176_1;
		synchronized (this.aClass176_1) {
			this.aClass176_1.method4540();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZLclient!bca;IILclient!da;Lclient!ha;ZIILclient!ha;I)Lclient!vr;")
	public Class33 method8903(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class69 arg5, @OriginalArg(6) Class13 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class13 arg10) {
		@Pc(16) Class33 local16 = this.method8907(arg9, arg8, arg2, arg4, arg3, arg6, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) Class374 local32 = this.method8900(arg0);
		if (arg3 > 1 && local32.anIntArray909 != null) {
			@Pc(42) int local42 = -1;
			for (@Pc(44) int local44 = 0; local44 < 10; local44++) {
				if (local32.anIntArray910[local44] <= arg3 && local32.anIntArray910[local44] != 0) {
					local42 = local32.anIntArray909[local44];
				}
			}
			if (local42 != -1) {
				local32 = this.method8900(local42);
			}
		}
		@Pc(93) int[] local93 = local32.method8995(arg8, arg1, arg9, arg10, arg6, arg4, arg3, arg2, arg5);
		if (local93 == null) {
			return null;
		}
		@Pc(108) Class33 local108;
		if (arg7) {
			local108 = arg10.method8479(36, local93, 32, 36);
		} else {
			local108 = arg6.method8479(36, local93, 32, 36);
		}
		if (!arg7) {
			@Pc(125) Class388 local125 = new Class388();
			local125.anInt10614 = arg4;
			local125.anInt10619 = arg6.anInt9671;
			local125.anInt10615 = arg3;
			local125.anInt10613 = arg8;
			local125.anInt10616 = arg0;
			local125.aBoolean806 = arg2 != null;
			local125.anInt10608 = arg9;
			this.aClass176_1.method4544(local108, local125);
		}
		return local108;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
	public void method8905() {
		@Pc(2) Class165 local2 = this.aClass165_76;
		synchronized (this.aClass165_76) {
			this.aClass165_76.method4403();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public void method8906(@OriginalArg(0) int arg0) {
		this.anInt10169 = arg0;
		@Pc(9) Class165 local9 = this.aClass165_76;
		synchronized (this.aClass165_76) {
			this.aClass165_76.method4403();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBLclient!bca;IILclient!ha;I)Lclient!vr;")
	public Class33 method8907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13 arg5, @OriginalArg(7) int arg6) {
		this.aClass388_1.anInt10614 = arg3;
		this.aClass388_1.anInt10619 = arg5.anInt9671;
		this.aClass388_1.anInt10616 = arg6;
		this.aClass388_1.anInt10615 = arg4;
		this.aClass388_1.anInt10608 = arg0;
		this.aClass388_1.anInt10613 = arg1;
		this.aClass388_1.aBoolean806 = arg2 != null;
		return (Class33) this.aClass176_1.method4542(this.aClass388_1);
	}
}
