import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "[Z")
	public volatile boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
	private int anInt511 = 0;

	@OriginalMember(owner = "client!cc", name = "Db", descriptor = "Z")
	public volatile boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
	private int anInt520 = 0;

	@OriginalMember(owner = "client!cc", name = "Bb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lclient!la;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lclient!jc;")
	public final Class25 aClass25_1;

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
	public final int anInt523;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!la;Lclient!jc;IZZ)V")
	public Class11_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		super(arg3, arg4);
		this.aClass30_1 = arg0;
		this.aClass25_1 = arg1;
		this.anInt523 = arg2;
		this.aClass30_1.method1169(0, this, true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	@Override
	protected void method328(@OriginalArg(0) int arg0) {
		this.aClass30_1.method1166(arg0 + 1, this);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)I")
	public int method356() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.aByteArrayArray3.length; local11++) {
			if (super.anIntArray68[local11] > 0) {
				local9 += this.method359(local11);
				local7 += 100;
			}
		}
		@Pc(46) int local46 = local9 * 100 / local7;
		if (local46 < this.anInt520) {
			local46 = this.anInt520;
		} else {
			this.anInt520 = local46;
		}
		return local46;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(II)I")
	private int method359(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray3[arg0] == null) {
			return this.aBooleanArray11[arg0] ? 100 : this.aClass30_1.method1170(arg0, this);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I")
	public int method361() {
		if (this.aBoolean36) {
			return 100;
		}
		@Pc(15) int local15 = this.aClass30_1.method1170(-1, this);
		if (local15 < this.anInt511) {
			local15 = this.anInt511;
		} else {
			this.anInt511 = local15;
		}
		if (local15 >= 100) {
			local15 = 99;
		}
		return local15;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(ZI)V")
	public void method362(@OriginalArg(0) boolean arg0) {
		if (this.aClass25_1 == null && !arg0) {
			return;
		}
		this.aBoolean35 = arg0;
		for (@Pc(26) int local26 = 0; super.aByteArrayArray3.length > local26; local26++) {
			if (super.anIntArray68[local26] > 0) {
				if (!this.aBooleanArray11[local26]) {
					this.aClass30_1.method1169(local26 + 1, this, false);
				} else if (arg0) {
					Static12.method369(local26, false, this);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[BIB)V")
	public void method363(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			if (this.aClass25_1 != null) {
				Static86.method1481(arg2 - 1, this, arg1);
				this.aBooleanArray11[arg2 - 1] = true;
			}
			if (arg0 || this.aBoolean35) {
				super.aByteArrayArray3[arg2 - 1] = arg1;
			}
			return;
		}
		this.method352(arg1);
		if (this.aClass25_1 != null) {
			Static37.method976(this);
			return;
		}
		this.aBooleanArray11 = new boolean[super.aByteArrayArray3.length];
		for (@Pc(27) int local27 = 0; local27 < this.aBooleanArray11.length; local27++) {
			this.aBooleanArray11[local27] = false;
		}
		this.aBoolean36 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method344(@OriginalArg(0) int arg0) {
		if (this.aClass25_1 == null || this.aBooleanArray11 == null || !this.aBooleanArray11[arg0]) {
			this.aClass30_1.method1169(arg0 + 1, this, true);
		} else {
			Static12.method369(arg0, true, this);
		}
	}
}
