import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	private int anInt5684;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	private int anInt5687;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
	private int anInt5682 = -1;

	static {
		new Class93("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(35) int local35 = this.anInt5687 * (this.anInt5684 == Static84.anInt1830 ? arg0 : this.anInt5684 * arg0 / Static84.anInt1830);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt5687 == Static339.anInt6735) {
				for (local57 = 0; local57 < Static339.anInt6735; local57++) {
					local65 = this.anIntArray416[local35++];
					local47[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local39[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static339.anInt6735; local57++) {
					local65 = local57 * this.anInt5687 / Static339.anInt6735;
					@Pc(117) int local117 = this.anIntArray416[local35 + local65];
					local47[local57] = (local117 & 0xFF) << 4;
					local43[local57] = local117 >> 4 & 0xFF0;
					local39[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)I")
	@Override
	public int method5879() {
		return this.anInt5682;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt5682 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	@Override
	public void method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5875(arg0, arg1);
		if (this.anInt5682 >= 0 && Static200.anInterface7_7 != null) {
			@Pc(27) int local27 = Static200.anInterface7_7.method5778(this.anInt5682).aBoolean609 ? 64 : 128;
			this.anIntArray416 = Static200.anInterface7_7.method5777(local27, 1.0F, this.anInt5682, local27, false);
			this.anInt5684 = local27;
			this.anInt5687 = local27;
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	public void method5878() {
		super.method5878();
		this.anIntArray416 = null;
	}
}
