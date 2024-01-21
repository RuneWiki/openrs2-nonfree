import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!ge", name = "mb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ge", name = "Jb", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
	private int anInt1054 = -1;

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "Z")
	private volatile boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ge", name = "Kb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ge", name = "kb", descriptor = "Lclient!t;")
	private final Class68 aClass68_2;

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
	private final int anInt1046;

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lclient!t;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!t;Lclient!t;IZZZ)V")
	public Class29_Sub1(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass68_2 = arg1;
		this.aBoolean54 = arg5;
		this.anInt1046 = arg2;
		this.aClass68_1 = arg0;
		Static64.method1261(this, this.anInt1046);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public int method764() {
		@Pc(3) int local3 = 0;
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < super.anObjectArray2.length; local14++) {
			if (super.anIntArray173[local14] > 0) {
				local12 += this.method771(local14);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local12 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	@Override
	protected void method734(@OriginalArg(1) int arg0) {
		Static112.method2034(this.anInt1046, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	private void method766() {
		this.aBooleanArray10 = new boolean[super.anObjectArray2.length];
		for (@Pc(18) int local18 = 0; local18 < this.aBooleanArray10.length; local18++) {
			this.aBooleanArray10[local18] = false;
		}
		if (this.aClass68_1 == null) {
			this.aBoolean53 = true;
			return;
		}
		this.anInt1054 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.aBooleanArray10.length; local47++) {
			if (super.anIntArray173[local47] > 0) {
				Static103.method1895(local47, this, this.aClass68_1);
				this.anInt1054 = local47;
			}
		}
		if (this.anInt1054 == -1) {
			this.aBoolean53 = true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBZIZ)V")
	public void method767(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg1) {
			if (this.aBoolean53) {
				throw new RuntimeException();
			}
			if (this.aClass68_2 != null) {
				Static75.method1475(this.anInt1046, this.aClass68_2, arg0);
			}
			this.method750(arg0);
			this.method766();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray169[arg2] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray169[arg2];
		if (this.aClass68_1 != null) {
			Static75.method1475(arg2, this.aClass68_1, arg0);
			this.aBooleanArray10[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg2] = Static46.method976(arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public void method769(@OriginalArg(0) int arg0) {
		this.anInt1064 = arg0;
		if (this.aClass68_2 == null) {
			Static112.method2061(this.anInt1064, (byte) 0, this, this.anInt1046, 255, true);
		} else {
			Static71.method1389(this.anInt1046, this.aClass68_2, this);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)V")
	@Override
	protected void method743(@OriginalArg(0) int arg0) {
		if (this.aClass68_1 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static112.method2061(super.anIntArray170[arg0], (byte) 2, this, arg0, this.anInt1046, true);
		} else {
			Static71.method1389(arg0, this.aClass68_1, this);
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)I")
	private int method771(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static93.method1726(this.anInt1046, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
	public int method772() {
		if (this.aBoolean53) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static93.method1726(255, this.anInt1046);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIZLclient!t;[B)V")
	public void method773(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(70) int local70;
		if (this.aClass68_2 == arg2) {
			if (this.aBoolean53) {
				throw new RuntimeException();
			}
			if (arg3 == null) {
				Static112.method2061(this.anInt1064, (byte) 0, this, this.anInt1046, 255, true);
				return;
			}
			Static5.aCRC32_1.reset();
			Static5.aCRC32_1.update(arg3, 0, arg3.length);
			local70 = (int) Static5.aCRC32_1.getValue();
			if (local70 != this.anInt1064) {
				Static112.method2061(this.anInt1064, (byte) 0, this, this.anInt1046, 255, true);
				return;
			}
			this.method750(arg3);
			this.method766();
			return;
		}
		if (!arg1 && arg0 == this.anInt1054) {
			this.aBoolean53 = true;
		}
		if (arg3 == null || arg3.length <= 2) {
			this.aBooleanArray10[arg0] = false;
			if (this.aBoolean54 || arg1) {
				Static112.method2061(super.anIntArray170[arg0], (byte) 2, this, arg0, this.anInt1046, arg1);
			}
			return;
		}
		Static5.aCRC32_1.reset();
		Static5.aCRC32_1.update(arg3, 0, arg3.length - 2);
		local70 = (int) Static5.aCRC32_1.getValue();
		@Pc(90) int local90 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
		if (super.anIntArray170[arg0] != local70 || local90 != super.anIntArray169[arg0]) {
			this.aBooleanArray10[arg0] = false;
			if (this.aBoolean54 || arg1) {
				Static112.method2061(super.anIntArray170[arg0], (byte) 2, this, arg0, this.anInt1046, arg1);
			}
			return;
		}
		this.aBooleanArray10[arg0] = true;
		if (arg1) {
			super.anObjectArray2[arg0] = Static46.method976(arg3);
			return;
		}
	}
}
