import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class271 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
	public int anInt7610;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public int anInt7613;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	public int anInt7614;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	public int anInt7615;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	public int anInt7617;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public int anInt7620;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public int anInt7622;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public int anInt7611 = 128;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public int anInt7621 = 128;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
	public int anInt7609;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
	public Class271(@OriginalArg(0) int arg0) {
		this.anInt7609 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIII)V")
	private Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7611 = arg2;
		this.anInt7620 = arg4;
		this.anInt7617 = arg5;
		this.anInt7621 = arg1;
		this.anInt7609 = arg0;
		this.anInt7613 = arg3;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!wt;B)V")
	public void method6028(@OriginalArg(0) Class271 arg0) {
		this.anInt7611 = arg0.anInt7611;
		this.anInt7617 = arg0.anInt7617;
		this.anInt7609 = arg0.anInt7609;
		this.anInt7621 = arg0.anInt7621;
		this.anInt7613 = arg0.anInt7613;
		this.anInt7620 = arg0.anInt7620;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Lclient!wt;")
	public Class271 method6029() {
		return new Class271(this.anInt7609, this.anInt7621, this.anInt7611, this.anInt7613, this.anInt7620, this.anInt7617);
	}
}
