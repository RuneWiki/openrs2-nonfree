import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class140 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
	private final int[] anIntArray323;

	static {
		new Class175("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([I)V")
	public Class140(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray323 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray323[local33] = -1;
		}
		@Pc(53) int local53 = 0;
		while (local53 < arg0.length) {
			@Pc(63) int local63;
			for (local63 = arg0[local53] & local5 - 1; this.anIntArray323[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray323[local63 + local63] = arg0[local53];
			this.anIntArray323[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)I")
	public int method3500(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray323.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(25) int local25 = this.anIntArray323[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (this.anIntArray323[local15 + local15] == arg0) {
				return local25;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
