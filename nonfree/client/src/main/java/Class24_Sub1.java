import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!fc", name = "gb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "Z")
	private volatile boolean aBoolean38 = false;

	@OriginalMember(owner = "client!fc", name = "Jb", descriptor = "I")
	private int anInt945 = -1;

	@OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
	private final int anInt932;

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lclient!cf;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!fc", name = "ob", descriptor = "Lclient!cf;")
	private final Class14 aClass14_2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!cf;Lclient!cf;IZZZ)V")
	public Class24_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt932 = arg2;
		this.aClass14_1 = arg1;
		this.aBoolean39 = arg5;
		this.aClass14_2 = arg0;
		Static1.method17(this, this.anInt932);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	private void method681() {
		this.aBooleanArray7 = new boolean[super.anObjectArray2.length];
		for (@Pc(17) int local17 = 0; local17 < this.aBooleanArray7.length; local17++) {
			this.aBooleanArray7[local17] = false;
		}
		if (this.aClass14_2 == null) {
			this.aBoolean38 = true;
			return;
		}
		this.anInt945 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray7.length; local42++) {
			if (super.anIntArray112[local42] > 0) {
				Static20.method507(this.aClass14_2, this, local42);
				this.anInt945 = local42;
			}
		}
		if (this.anInt945 == -1) {
			this.aBoolean38 = true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BBIZZ)V")
	public void method683(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg2) {
			if (this.aBoolean38) {
				throw new RuntimeException();
			}
			if (this.aClass14_1 != null) {
				Static73.method1208(arg0, this.anInt932, this.aClass14_1);
			}
			this.method674(arg0);
			this.method681();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray111[arg1] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray111[arg1];
		if (this.aClass14_2 != null) {
			Static73.method1208(arg0, arg1, this.aClass14_2);
			this.aBooleanArray7[arg1] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg1] = Static115.method1807(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BZLclient!cf;II)V")
	public void method684(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(4) int arg3) {
		@Pc(59) int local59;
		if (this.aClass14_1 == arg2) {
			if (this.aBoolean38) {
				throw new RuntimeException();
			}
			if (arg0 == null) {
				Static37.method465(true, (byte) 0, this, this.anInt932, this.anInt933, 255);
				return;
			}
			Static46.aCRC32_1.reset();
			Static46.aCRC32_1.update(arg0, 0, arg0.length);
			local59 = (int) Static46.aCRC32_1.getValue();
			if (local59 != this.anInt933) {
				Static37.method465(true, (byte) 0, this, this.anInt932, this.anInt933, 255);
				return;
			}
			this.method674(arg0);
			this.method681();
			return;
		}
		if (!arg1 && arg3 == this.anInt945) {
			this.aBoolean38 = true;
		}
		if (arg0 == null || arg0.length <= 2) {
			this.aBooleanArray7[arg3] = false;
			if (this.aBoolean39 || arg1) {
				Static37.method465(arg1, (byte) 2, this, arg3, super.anIntArray114[arg3], this.anInt932);
			}
			return;
		}
		Static46.aCRC32_1.reset();
		Static46.aCRC32_1.update(arg0, 0, arg0.length - 2);
		local59 = (int) Static46.aCRC32_1.getValue();
		@Pc(79) int local79 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
		if (super.anIntArray114[arg3] != local59 || local79 != super.anIntArray111[arg3]) {
			this.aBooleanArray7[arg3] = false;
			if (this.aBoolean39 || arg1) {
				Static37.method465(arg1, (byte) 2, this, arg3, super.anIntArray114[arg3], this.anInt932);
			}
			return;
		}
		this.aBooleanArray7[arg3] = true;
		if (arg1) {
			super.anObjectArray2[arg3] = Static115.method1807(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)V")
	public void method687(@OriginalArg(0) int arg0) {
		this.anInt933 = arg0;
		if (this.aClass14_1 == null) {
			Static37.method465(true, (byte) 0, this, this.anInt932, this.anInt933, 255);
		} else {
			Static79.method1281(this.aClass14_1, this, this.anInt932);
		}
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)I")
	public int method688() {
		if (this.aBoolean38) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static93.method1559(this.anInt932, 255);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)I")
	private int method690(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static93.method1559(arg0, this.anInt932);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IZ)V")
	@Override
	protected void method672(@OriginalArg(0) int arg0) {
		if (this.aClass14_2 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static37.method465(true, (byte) 2, this, arg0, super.anIntArray114[arg0], this.anInt932);
		} else {
			Static79.method1281(this.aClass14_2, this, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
	public int method692() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(19) int local19 = 0; local19 < super.anObjectArray2.length; local19++) {
			if (super.anIntArray112[local19] > 0) {
				local9 += 100;
				local3 += this.method690(local19);
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local3 * 100 / local9;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
	@Override
	protected void method661(@OriginalArg(0) int arg0) {
		Static58.method1028(this.anInt932, arg0);
	}
}
