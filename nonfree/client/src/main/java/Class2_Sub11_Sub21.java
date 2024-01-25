import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class2_Sub11_Sub21 extends Class2_Sub11 {

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	protected int anInt8106;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	protected int anInt8108;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "[I")
	protected int[] anIntArray579;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
	private int anInt8109 = -1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)Z")
	protected final boolean method7240() {
		if (this.anIntArray579 != null) {
			return true;
		} else if (this.anInt8109 >= 0) {
			@Pc(43) Class355 local43 = Static446.anInt7236 < 0 ? Static737.method8359(Static230.aClass254_80, this.anInt8109) : Static737.method8362(Static230.aClass254_80, Static446.anInt7236, this.anInt8109);
			local43.method8353();
			this.anIntArray579 = local43.method8365();
			this.anInt8106 = local43.anInt9469;
			this.anInt8108 = local43.anInt9470;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846 && this.method7240()) {
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			@Pc(61) int local61 = this.anInt8106 * (this.anInt8108 == Static609.anInt9448 ? arg0 : arg0 * this.anInt8108 / Static609.anInt9448);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static301.anInt10214 == this.anInt8106) {
				for (local67 = 0; local67 < Static301.anInt10214; local67++) {
					local75 = this.anIntArray579[local61++];
					local40[local67] = (local75 & 0xFF) << 4;
					local36[local67] = local75 >> 4 & 0xFF0;
					local32[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static301.anInt10214; local67++) {
					local75 = local67 * this.anInt8106 / Static301.anInt10214;
					@Pc(125) int local125 = this.anIntArray579[local75 + local61];
					local40[local67] = (local125 & 0xFF) << 4;
					local36[local67] = local125 >> 4 & 0xFF0;
					local32[local67] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public final void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8109 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	@Override
	public final void method9536() {
		super.method9536();
		this.anIntArray579 = null;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I")
	@Override
	public final int method9537() {
		return this.anInt8109;
	}
}
