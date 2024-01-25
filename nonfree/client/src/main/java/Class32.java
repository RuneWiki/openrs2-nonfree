import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class32 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!nj;I)V")
	private void method875(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static331.method5972(arg0.method4097());
		} else if (arg1 == 2) {
			this.anInt813 = arg0.method4108();
		} else if (arg1 == 4) {
			this.aBoolean56 = false;
		} else if (arg1 == 5) {
			this.aString5 = arg0.method4073();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Z")
	public boolean method879() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!nj;)V")
	public void method880(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method875(arg0, local5);
		}
	}
}
