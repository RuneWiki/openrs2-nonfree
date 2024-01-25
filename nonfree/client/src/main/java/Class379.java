import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class379 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
	private int anInt10600 = 0;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	private int anInt10599 = -1;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Lclient!tg;")
	private Class330 aClass330_65 = new Class330();

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "Z")
	public boolean aBoolean761 = false;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	private final int anInt10602;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	private final int anInt10601;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[Lclient!uga;")
	private Class5_Sub52[] aClass5_Sub52Array1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(III)V")
	public Class379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10602 = arg0;
		this.anInt10601 = arg1;
		this.anIntArrayArray76 = new int[this.anInt10602][arg2];
		this.aClass5_Sub52Array1 = new Class5_Sub52[this.anInt10601];
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)[[I")
	public int[][] method9009() {
		if (this.anInt10602 != this.anInt10601) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt10602; local25++) {
			this.aClass5_Sub52Array1[local25] = Static390.aClass5_Sub52_1;
		}
		return this.anIntArrayArray76;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public void method9011() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10602; local7++) {
			this.anIntArrayArray76[local7] = null;
		}
		this.anIntArrayArray76 = null;
		this.aClass5_Sub52Array1 = null;
		this.aClass330_65.method7910();
		this.aClass330_65 = null;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	public int[] method9012(@OriginalArg(0) int arg0) {
		if (this.anInt10601 == this.anInt10602) {
			this.aBoolean761 = this.aClass5_Sub52Array1[arg0] == null;
			this.aClass5_Sub52Array1[arg0] = Static390.aClass5_Sub52_1;
			return this.anIntArrayArray76[arg0];
		} else if (this.anInt10602 == 1) {
			this.aBoolean761 = arg0 != this.anInt10599;
			this.anInt10599 = arg0;
			return this.anIntArrayArray76[0];
		} else {
			@Pc(44) Class5_Sub52 local44 = this.aClass5_Sub52Array1[arg0];
			if (local44 == null) {
				this.aBoolean761 = true;
				if (this.anInt10602 <= this.anInt10600) {
					@Pc(65) Class5_Sub52 local65 = (Class5_Sub52) this.aClass330_65.method7913();
					local44 = new Class5_Sub52(arg0, local65.anInt9562);
					this.aClass5_Sub52Array1[local65.anInt9563] = null;
					local65.method9047();
				} else {
					local44 = new Class5_Sub52(arg0, this.anInt10600);
					this.anInt10600++;
				}
				this.aClass5_Sub52Array1[arg0] = local44;
			} else {
				this.aBoolean761 = false;
			}
			this.aClass330_65.method7919(local44);
			return this.anIntArrayArray76[local44.anInt9562];
		}
	}
}
