import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class1_Sub5_Sub18 extends Class1_Sub5 {

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
	public int anInt6640 = -1;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
	public int anInt6642 = 12800;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "Z")
	public boolean aBoolean730 = true;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
	public int anInt6641 = -1;

	@OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
	public int anInt6647 = 0;

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
	public int anInt6648 = 0;

	@OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
	public int anInt6649 = 12800;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
	public final int anInt6646;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
	public final int anInt6637;

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "Lclient!sr;")
	public final Class227 aClass227_42;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub5_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString70 = arg1;
		this.aString71 = arg2;
		this.anInt6646 = arg3;
		this.aBoolean730 = arg5;
		this.anInt6641 = arg6;
		this.anInt6640 = arg4;
		this.anInt6637 = arg0;
		if (this.anInt6641 == 255) {
			this.anInt6641 = 0;
		}
		this.aClass227_42 = new Class227();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[II)Z")
	public boolean method5197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class1_Sub45 local16 = (Class1_Sub45) this.aClass227_42.method4967(); local16 != null; local16 = (Class1_Sub45) this.aClass227_42.method4973()) {
			if (local16.method5924(arg0, arg1, arg3)) {
				local16.method5922(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[II)Z")
	public boolean method5200(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class1_Sub45 local9 = (Class1_Sub45) this.aClass227_42.method4967(); local9 != null; local9 = (Class1_Sub45) this.aClass227_42.method4973()) {
			if (local9.method5920(arg2, arg0)) {
				local9.method5918(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public void method5203() {
		this.anInt6642 = 12800;
		this.anInt6649 = 12800;
		this.anInt6648 = 0;
		this.anInt6647 = 0;
		for (@Pc(31) Class1_Sub45 local31 = (Class1_Sub45) this.aClass227_42.method4967(); local31 != null; local31 = (Class1_Sub45) this.aClass227_42.method4973()) {
			if (local31.anInt7501 < this.anInt6649) {
				this.anInt6649 = local31.anInt7501;
			}
			if (this.anInt6648 < local31.anInt7497) {
				this.anInt6648 = local31.anInt7497;
			}
			if (local31.anInt7507 > this.anInt6647) {
				this.anInt6647 = local31.anInt7507;
			}
			if (local31.anInt7495 < this.anInt6642) {
				this.anInt6642 = local31.anInt7495;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Z")
	public boolean method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class1_Sub45 local11 = (Class1_Sub45) this.aClass227_42.method4967(); local11 != null; local11 = (Class1_Sub45) this.aClass227_42.method4973()) {
			if (local11.method5923(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ[I)Z")
	public boolean method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(21) Class1_Sub45 local21 = (Class1_Sub45) this.aClass227_42.method4967(); local21 != null; local21 = (Class1_Sub45) this.aClass227_42.method4973()) {
			if (local21.method5923(arg1, arg0)) {
				local21.method5922(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
