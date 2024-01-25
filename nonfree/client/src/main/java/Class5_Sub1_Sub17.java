import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	static {
		new Class40(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static147.anInt3075; local37++) {
				this.method3517(arg0, local37);
				@Pc(50) int[][] local50 = this.method7154(0, Static115.anInt2497);
				local27[local37] = local50[0][Static506.anInt8615];
				local31[local37] = local50[1][Static506.anInt8615];
				local35[local37] = local50[2][Static506.anInt8615];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(III)V")
	private void method3517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static315.anIntArray425[arg1];
		@Pc(13) int local13 = Static295.anIntArray403[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static506.anInt8615 = arg1;
			Static115.anInt2497 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static506.anInt8615 = arg0;
			Static115.anInt2497 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static506.anInt8615 = Static147.anInt3075 - arg0;
			Static115.anInt2497 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static506.anInt8615 = arg1;
			Static115.anInt2497 = Static250.anInt5057 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static115.anInt2497 = Static250.anInt5057 - arg0;
			Static506.anInt8615 = Static147.anInt3075 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static506.anInt8615 = Static147.anInt3075 - arg0;
			Static115.anInt2497 = Static250.anInt5057 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static115.anInt2497 = Static250.anInt5057 - arg1;
			Static506.anInt8615 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static506.anInt8615 = Static147.anInt3075 - arg1;
			Static115.anInt2497 = arg0;
		}
		Static506.anInt8615 &= Static497.anInt9138;
		Static115.anInt2497 &= Static160.anInt3274;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			for (@Pc(25) int local25 = 0; local25 < Static147.anInt3075; local25++) {
				this.method3517(arg0, local25);
				@Pc(38) int[] local38 = this.method7160(0, Static115.anInt2497);
				local19[local25] = local38[Static506.anInt8615];
			}
		}
		return local19;
	}
}
