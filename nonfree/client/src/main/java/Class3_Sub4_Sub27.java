import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class3_Sub4_Sub27 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
	private int anInt5736 = 0;

	@OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
	private int anInt5737 = 4096;

	static {
		new Class175("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5960(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static106.anInt2356; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5736) {
					local19[local31] = this.anInt5736;
				} else if (local37 <= this.anInt5737) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt5737;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5736 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt5737 = arg1.method6004();
		} else if (arg0 == 2) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(23) int[][] local23 = this.method5962(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static106.anInt2356; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(59) int local59 = local31[local49];
				@Pc(63) int local63 = local35[local49];
				if (this.anInt5736 > local55) {
					local39[local49] = this.anInt5736;
				} else if (local55 > this.anInt5737) {
					local39[local49] = this.anInt5737;
				} else {
					local39[local49] = local55;
				}
				if (local59 < this.anInt5736) {
					local43[local49] = this.anInt5736;
				} else if (local59 > this.anInt5737) {
					local43[local49] = this.anInt5737;
				} else {
					local43[local49] = local59;
				}
				if (this.anInt5736 > local63) {
					local47[local49] = this.anInt5736;
				} else if (local63 > this.anInt5737) {
					local47[local49] = this.anInt5737;
				} else {
					local47[local49] = local63;
				}
			}
		}
		return local11;
	}
}
