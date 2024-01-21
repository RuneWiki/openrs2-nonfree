import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
	private int anInt1307;

	@OriginalMember(owner = "client!je", name = "vb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
	private int anInt1309 = -1;

	@OriginalMember(owner = "client!je", name = "qb", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!je", name = "Eb", descriptor = "Z")
	private volatile boolean aBoolean67 = false;

	@OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
	private final int anInt1315;

	@OriginalMember(owner = "client!je", name = "wb", descriptor = "Lclient!bf;")
	private final Class10 aClass10_2;

	@OriginalMember(owner = "client!je", name = "Lb", descriptor = "Lclient!bf;")
	private final Class10 aClass10_3;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!bf;Lclient!bf;IZZZ)V")
	public Class3_Sub1(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1315 = arg2;
		this.aBoolean66 = arg5;
		this.aClass10_2 = arg1;
		this.aClass10_3 = arg0;
		Static51.method1837(this.anInt1315, this);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	private void method950() {
		this.aBooleanArray6 = new boolean[super.aByteArrayArray21.length];
		for (@Pc(18) int local18 = 0; local18 < this.aBooleanArray6.length; local18++) {
			this.aBooleanArray6[local18] = false;
		}
		if (this.aClass10_3 == null) {
			this.aBoolean67 = true;
			return;
		}
		this.anInt1309 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.aBooleanArray6.length; local47++) {
			if (super.anIntArray171[local47] > 0) {
				Static57.method1050(local47, this.aClass10_3, this);
				this.anInt1309 = local47;
			}
		}
		if (this.anInt1309 == -1) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BZIZLclient!bf;)V")
	public void method952(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class10 arg3) {
		@Pc(45) int local45;
		if (arg3 != this.aClass10_2) {
			if (!arg2 && arg1 == this.anInt1309) {
				this.aBoolean67 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray6[arg1] = false;
				if (this.aBoolean66 || arg2) {
					Static6.method147(this.anInt1315, (byte) 2, arg1, arg2, this, super.anIntArray175[arg1]);
				}
			} else {
				Static104.aCRC32_2.reset();
				Static104.aCRC32_2.update(arg0, 0, arg0.length - 2);
				local45 = (int) Static104.aCRC32_2.getValue();
				@Pc(154) int local154 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local45 == super.anIntArray175[arg1] && super.anIntArray174[arg1] == local154) {
					this.aBooleanArray6[arg1] = true;
					if (arg2) {
						super.aByteArrayArray21[arg1] = arg0;
					}
				} else {
					this.aBooleanArray6[arg1] = false;
					if (this.aBoolean66 || arg2) {
						Static6.method147(this.anInt1315, (byte) 2, arg1, arg2, this, super.anIntArray175[arg1]);
					}
				}
			}
		} else if (this.aBoolean67) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static6.method147(255, (byte) 0, this.anInt1315, true, this, this.anInt1307);
		} else {
			Static104.aCRC32_2.reset();
			Static104.aCRC32_2.update(arg0, 0, arg0.length);
			local45 = (int) Static104.aCRC32_2.getValue();
			if (this.anInt1307 == local45) {
				this.method948(arg0);
				this.method950();
			} else {
				Static6.method147(255, (byte) 0, this.anInt1315, true, this, this.anInt1307);
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V")
	public void method954(@OriginalArg(1) int arg0) {
		this.anInt1307 = arg0;
		if (this.aClass10_2 == null) {
			Static6.method147(255, (byte) 0, this.anInt1315, true, this, this.anInt1307);
		} else {
			Static36.method734(this.aClass10_2, this.anInt1315, this);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI[BZI)V")
	public void method955(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			arg2[arg2.length - 2] = (byte) (super.anIntArray174[arg1] >> 8);
			arg2[arg2.length - 1] = (byte) super.anIntArray174[arg1];
			if (this.aClass10_3 != null) {
				Static92.method1678(arg2, arg1, this.aClass10_3);
				this.aBooleanArray6[arg1] = true;
			}
			if (arg0) {
				super.aByteArrayArray21[arg1] = arg2;
			}
		} else if (this.aBoolean67) {
			throw new RuntimeException();
		} else {
			if (this.aClass10_2 != null) {
				Static92.method1678(arg2, this.anInt1315, this.aClass10_2);
			}
			this.method948(arg2);
			this.method950();
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
	public int method956() {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; super.aByteArrayArray21.length > local19; local19++) {
			if (super.anIntArray171[local19] > 0) {
				local7 += this.method960(local19);
				local17 += 100;
			}
		}
		if (local17 == 0) {
			return 100;
		} else {
			return local7 * 100 / local17;
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I")
	public int method958() {
		if (this.aBoolean67) {
			return 100;
		} else if (super.aByteArrayArray21 == null) {
			@Pc(19) int local19 = Static83.method1511(this.anInt1315, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V")
	@Override
	protected void method945(@OriginalArg(1) int arg0) {
		if (this.aClass10_3 == null || this.aBooleanArray6 == null || !this.aBooleanArray6[arg0]) {
			Static6.method147(this.anInt1315, (byte) 2, arg0, true, this, super.anIntArray175[arg0]);
		} else {
			Static36.method734(this.aClass10_3, arg0, this);
		}
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(II)I")
	private int method960(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray21[arg0] == null) {
			return this.aBooleanArray6[arg0] ? 100 : Static83.method1511(arg0, this.anInt1315);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V")
	@Override
	protected void method942(@OriginalArg(1) int arg0) {
		Static29.method627(arg0, this.anInt1315);
	}
}
