import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!md", name = "jb", descriptor = "I")
	private int anInt1916;

	@OriginalMember(owner = "client!md", name = "vb", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!md", name = "Eb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "Z")
	private volatile boolean aBoolean73 = false;

	@OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
	private int anInt1918 = -1;

	@OriginalMember(owner = "client!md", name = "wb", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!md", name = "Ab", descriptor = "Lclient!pd;")
	private final Class61 aClass61_4;

	@OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
	private final int anInt1930;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "Lclient!pd;")
	private final Class61 aClass61_3;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!pd;Lclient!pd;IZZZ)V")
	public Class14_Sub1(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass61_4 = arg0;
		this.aBoolean74 = arg5;
		this.anInt1930 = arg2;
		this.aClass61_3 = arg1;
		Static84.method1248(this.anInt1930, this);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B[BZZI)V")
	public void method1170(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg2) {
			if (this.aBoolean73) {
				throw new RuntimeException();
			}
			if (this.aClass61_3 != null) {
				Static79.method1134(this.aClass61_3, arg0, this.anInt1930);
			}
			this.method1143(arg0);
			this.method1171();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray245[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray245[arg3];
		if (this.aClass61_4 != null) {
			Static79.method1134(this.aClass61_4, arg0, arg3);
			this.aBooleanArray12[arg3] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg3] = Static45.method679(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	private void method1171() {
		this.aBooleanArray12 = new boolean[super.anObjectArray2.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray12.length; local9++) {
			this.aBooleanArray12[local9] = false;
		}
		if (this.aClass61_4 == null) {
			this.aBoolean73 = true;
			return;
		}
		this.anInt1918 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray12.length; local42++) {
			if (super.anIntArray249[local42] > 0) {
				Static118.method1652(this, local42, this.aClass61_4);
				this.anInt1918 = local42;
			}
		}
		if (this.anInt1918 == -1) {
			this.aBoolean73 = true;
		}
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
	public int method1173() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray2.length; local11++) {
			if (super.anIntArray249[local11] > 0) {
				local9 += this.method1178(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
	public int method1174() {
		if (this.aBoolean73) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static47.method731(this.anInt1930, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(II)V")
	@Override
	protected void method1167(@OriginalArg(1) int arg0) {
		Static6.method41(arg0, this.anInt1930);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
	public void method1175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1927 = arg0;
		this.anInt1916 = arg1;
		if (this.aClass61_3 == null) {
			Static77.method1121(255, (byte) 0, this.anInt1930, this.anInt1927, this, true);
		} else {
			Static73.method1083(this, this.aClass61_3, this.anInt1930);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
	private int method1178(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray12[arg0] ? 100 : Static47.method731(arg0, this.anInt1930);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BZBLclient!pd;I)V")
	public void method1179(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3) {
		@Pc(47) int local47;
		if (arg2 != this.aClass61_3) {
			if (!arg1 && arg3 == this.anInt1918) {
				this.aBoolean73 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray12[arg3] = false;
				if (this.aBoolean74 || arg1) {
					Static77.method1121(this.anInt1930, (byte) 2, arg3, super.anIntArray251[arg3], this, arg1);
				}
			} else {
				Static21.aCRC32_1.reset();
				Static21.aCRC32_1.update(arg0, 0, arg0.length - 2);
				local47 = (int) Static21.aCRC32_1.getValue();
				@Pc(193) int local193 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local47 == super.anIntArray251[arg3] && super.anIntArray245[arg3] == local193) {
					this.aBooleanArray12[arg3] = true;
					if (arg1) {
						super.anObjectArray2[arg3] = Static45.method679(arg0);
					}
				} else {
					this.aBooleanArray12[arg3] = false;
					if (this.aBoolean74 || arg1) {
						Static77.method1121(this.anInt1930, (byte) 2, arg3, super.anIntArray251[arg3], this, arg1);
					}
				}
			}
		} else if (this.aBoolean73) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static77.method1121(255, (byte) 0, this.anInt1930, this.anInt1927, this, true);
		} else {
			Static21.aCRC32_1.reset();
			Static21.aCRC32_1.update(arg0, 0, arg0.length);
			local47 = (int) Static21.aCRC32_1.getValue();
			@Pc(54) Class8_Sub20 local54 = new Class8_Sub20(Static20.method369(arg0));
			@Pc(58) int local58 = local54.method1872();
			if (local58 != 5 && local58 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local58);
			}
			@Pc(79) int local79 = 0;
			if (local58 >= 6) {
				local79 = local54.method1853();
			}
			if (this.anInt1927 == local47 && this.anInt1916 == local79) {
				this.method1143(arg0);
				this.method1171();
			} else {
				Static77.method1121(255, (byte) 0, this.anInt1930, this.anInt1927, this, true);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1161(@OriginalArg(1) int arg0) {
		if (this.aClass61_4 == null || this.aBooleanArray12 == null || !this.aBooleanArray12[arg0]) {
			Static77.method1121(this.anInt1930, (byte) 2, arg0, super.anIntArray251[arg0], this, true);
		} else {
			Static73.method1083(this, this.aClass61_4, arg0);
		}
	}
}
