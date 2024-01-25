import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class180 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
	public int[] anIntArray613;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Lclient!dl;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public int anInt4943;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "[I")
	public int[] anIntArray614;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public int anInt4944;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "[Lclient!dl;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "[I")
	public int[] anIntArray617;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "[I")
	public int[] anIntArray618;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public final int anInt4945;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "([BI)V")
	public Class180(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4945 = Static14.method437(arg0, arg0.length);
		if (this.anInt4945 != arg1) {
			throw new RuntimeException();
		}
		this.method4314(arg0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([BI)V")
	private void method4314(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub13 local12 = new Class2_Sub13(Static171.method2803(arg0));
		@Pc(16) int local16 = local12.method4240();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt4942 = local12.method4239();
		} else {
			this.anInt4942 = 0;
		}
		@Pc(43) int local43 = local12.method4240();
		this.anInt4943 = local12.method4245();
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = -1;
		this.anIntArray618 = new int[this.anInt4943];
		for (@Pc(59) int local59 = 0; local59 < this.anInt4943; local59++) {
			this.anIntArray618[local59] = local50 += local12.method4245();
			if (local52 < this.anIntArray618[local59]) {
				local52 = this.anIntArray618[local59];
			}
		}
		this.anInt4944 = local52 + 1;
		this.anIntArray617 = new int[this.anInt4944];
		this.anIntArrayArray42 = new int[this.anInt4944][];
		this.anIntArray615 = new int[this.anInt4944];
		this.anIntArray616 = new int[this.anInt4944];
		this.anIntArray613 = new int[this.anInt4944];
		@Pc(130) int local130;
		@Pc(148) int local148;
		if (local43 != 0) {
			this.anIntArray614 = new int[this.anInt4944];
			for (local130 = 0; local130 < this.anInt4944; local130++) {
				this.anIntArray614[local130] = -1;
			}
			for (local148 = 0; local148 < this.anInt4943; local148++) {
				this.anIntArray614[this.anIntArray618[local148]] = local12.method4239();
			}
			this.aClass49_1 = new Class49(this.anIntArray614);
		}
		for (local130 = 0; local130 < this.anInt4943; local130++) {
			this.anIntArray617[this.anIntArray618[local130]] = local12.method4239();
		}
		for (local148 = 0; local148 < this.anInt4943; local148++) {
			this.anIntArray616[this.anIntArray618[local148]] = local12.method4239();
		}
		for (@Pc(212) int local212 = 0; local212 < this.anInt4943; local212++) {
			this.anIntArray613[this.anIntArray618[local212]] = local12.method4245();
		}
		@Pc(242) int local242;
		@Pc(249) int local249;
		@Pc(251) int local251;
		@Pc(259) int local259;
		@Pc(276) int local276;
		for (@Pc(235) int local235 = 0; local235 < this.anInt4943; local235++) {
			local242 = this.anIntArray618[local235];
			local50 = 0;
			local249 = this.anIntArray613[local242];
			local251 = -1;
			this.anIntArrayArray42[local242] = new int[local249];
			for (local259 = 0; local259 < local249; local259++) {
				local276 = this.anIntArrayArray42[local242][local259] = local50 += local12.method4245();
				if (local276 > local251) {
					local251 = local276;
				}
			}
			this.anIntArray615[local242] = local251 + 1;
			if (local249 == local251 + 1) {
				this.anIntArrayArray42[local242] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.aClass49Array1 = new Class49[local52 + 1];
		this.anIntArrayArray40 = new int[local52 + 1][];
		for (local242 = 0; local242 < this.anInt4943; local242++) {
			local249 = this.anIntArray618[local242];
			local251 = this.anIntArray613[local249];
			this.anIntArrayArray40[local249] = new int[this.anIntArray615[local249]];
			for (local259 = 0; local259 < this.anIntArray615[local249]; local259++) {
				this.anIntArrayArray40[local249][local259] = -1;
			}
			for (local276 = 0; local276 < local251; local276++) {
				@Pc(392) int local392;
				if (this.anIntArrayArray42[local249] == null) {
					local392 = local276;
				} else {
					local392 = this.anIntArrayArray42[local249][local276];
				}
				this.anIntArrayArray40[local249][local392] = local12.method4239();
			}
			this.aClass49Array1[local249] = new Class49(this.anIntArrayArray40[local249]);
		}
	}
}
