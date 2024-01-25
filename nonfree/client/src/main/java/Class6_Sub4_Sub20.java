import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class6_Sub4_Sub20 extends Class6_Sub4 {

	@OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
	public int anInt10635 = 12800;

	@OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
	public int anInt10642 = -1;

	@OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
	public int anInt10641 = 0;

	@OriginalMember(owner = "client!wia", name = "y", descriptor = "I")
	public int anInt10630 = -1;

	@OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
	public int anInt10634 = 12800;

	@OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
	public int anInt10644 = 0;

	@OriginalMember(owner = "client!wia", name = "O", descriptor = "Z")
	public boolean aBoolean737 = true;

	@OriginalMember(owner = "client!wia", name = "A", descriptor = "I")
	public final int anInt10631;

	@OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
	public final int anInt10637;

	@OriginalMember(owner = "client!wia", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString152;

	@OriginalMember(owner = "client!wia", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString151;

	@OriginalMember(owner = "client!wia", name = "E", descriptor = "Lclient!v;")
	public final Class362 aClass362_65;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt10642 = arg4;
		this.anInt10631 = arg3;
		this.anInt10637 = arg0;
		this.aString152 = arg1;
		this.anInt10630 = arg6;
		this.aBoolean737 = arg5;
		this.aString151 = arg2;
		if (this.anInt10630 == 255) {
			this.anInt10630 = 0;
		}
		this.aClass362_65 = new Class362();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I[III)Z")
	public boolean method9022(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(18) Class6_Sub43 local18 = (Class6_Sub43) this.aClass362_65.method8538(); local18 != null; local18 = (Class6_Sub43) this.aClass362_65.method8530()) {
			if (local18.method6444(arg1, arg2)) {
				local18.method6451(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(IBI)Z")
	public boolean method9023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class6_Sub43 local19 = (Class6_Sub43) this.aClass362_65.method8538(); local19 != null; local19 = (Class6_Sub43) this.aClass362_65.method8530()) {
			if (local19.method6444(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
	public void method9024() {
		this.anInt10635 = 12800;
		this.anInt10634 = 12800;
		this.anInt10644 = 0;
		this.anInt10641 = 0;
		for (@Pc(29) Class6_Sub43 local29 = (Class6_Sub43) this.aClass362_65.method8538(); local29 != null; local29 = (Class6_Sub43) this.aClass362_65.method8530()) {
			if (this.anInt10634 > local29.anInt7454) {
				this.anInt10634 = local29.anInt7454;
			}
			if (this.anInt10641 < local29.anInt7451) {
				this.anInt10641 = local29.anInt7451;
			}
			if (this.anInt10644 < local29.anInt7452) {
				this.anInt10644 = local29.anInt7452;
			}
			if (this.anInt10635 > local29.anInt7458) {
				this.anInt10635 = local29.anInt7458;
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II[III)Z")
	public boolean method9026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class6_Sub43 local16 = (Class6_Sub43) this.aClass362_65.method8538(); local16 != null; local16 = (Class6_Sub43) this.aClass362_65.method8530()) {
			if (local16.method6448(arg0, arg3, arg1)) {
				local16.method6451(arg2, arg1, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(I[III)Z")
	public boolean method9030(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class6_Sub43 local11 = (Class6_Sub43) this.aClass362_65.method8538(); local11 != null; local11 = (Class6_Sub43) this.aClass362_65.method8530()) {
			if (local11.method6447(arg2, arg1)) {
				local11.method6449(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}
}
