import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class286 implements Interface10 {

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "Lclient!lb;")
	private Class174 aClass174_33 = new Class174(128);

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "[I")
	private final int[] anIntArray641 = new int[Static133.aClass173_1.anInt5155];

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "[I")
	public final int[] anIntArray642 = new int[Static133.aClass173_1.anInt5155];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZII)V")
	public void method6993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray641[arg0] = arg1;
		@Pc(22) Class1_Sub45 local22 = (Class1_Sub45) this.aClass174_33.method4422((long) arg0);
		if (local22 == null) {
			local22 = new Class1_Sub45(4611686018427387905L);
			this.aClass174_33.method4420(local22, (long) arg0);
		} else if (local22.aLong200 != 4611686018427387905L) {
			local22.aLong200 = Static93.method2172() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(BI)I")
	@Override
	public int method6992(@OriginalArg(1) int arg0) {
		@Pc(16) Class198 local16 = Static483.aClass187_1.method4858(arg0);
		@Pc(19) int local19 = local16.anInt5895;
		@Pc(22) int local22 = local16.anInt5889;
		@Pc(25) int local25 = local16.anInt5890;
		@Pc(32) int local32 = Class56.anIntArray173[local25 - local22];
		return this.anIntArray642[local19] >> local22 & local32;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V")
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class198 local8 = Static483.aClass187_1.method4858(arg1);
		@Pc(11) int local11 = local8.anInt5895;
		@Pc(22) int local22 = local8.anInt5889;
		@Pc(25) int local25 = local8.anInt5890;
		@Pc(31) int local31 = Class56.anIntArray173[local25 - local22];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local22;
		this.method6993(local11, arg0 << local22 & local31 | this.anIntArray641[local11] & ~local31);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZZ)I")
	public int method6995(@OriginalArg(0) boolean arg0) {
		@Pc(6) long local6 = Static93.method2172();
		for (@Pc(20) Class1_Sub45 local20 = arg0 ? (Class1_Sub45) this.aClass174_33.method4421() : (Class1_Sub45) this.aClass174_33.method4429(); local20 != null; local20 = (Class1_Sub45) this.aClass174_33.method4429()) {
			if (local6 > (local20.aLong200 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local20.aLong200 & 0x4000000000000000L) != 0L) {
					@Pc(45) int local45 = (int) local20.aLong244;
					this.anIntArray642[local45] = this.anIntArray641[local45];
					local20.method7983();
					return local45;
				}
				local20.method7983();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(III)V")
	public void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray642[arg1] = arg0;
		@Pc(19) Class1_Sub45 local19 = (Class1_Sub45) this.aClass174_33.method4422((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub45(Static93.method2172() + 500L);
			this.aClass174_33.method4420(local19, (long) arg1);
		} else {
			local19.aLong200 = Static93.method2172() + 500L;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public void method6997() {
		for (@Pc(1) int local1 = 0; local1 < Static133.aClass173_1.anInt5155; local1++) {
			@Pc(7) Class88 local7 = Static133.aClass173_1.method4409(local1);
			if (local7 != null && local7.anInt3124 == 0) {
				this.anIntArray641[local1] = 0;
				this.anIntArray642[local1] = 0;
			}
		}
		this.aClass174_33 = new Class174(128);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V")
	public void method6998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class198 local8 = Static483.aClass187_1.method4858(arg0);
		@Pc(11) int local11 = local8.anInt5895;
		@Pc(18) int local18 = local8.anInt5889;
		@Pc(21) int local21 = local8.anInt5890;
		@Pc(28) int local28 = Class56.anIntArray173[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method6996(this.anIntArray642[local11] & ~local28 | local28 & arg1 << local18, local11);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)I")
	@Override
	public int method6991(@OriginalArg(1) int arg0) {
		return this.anIntArray642[arg0];
	}
}
