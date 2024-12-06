import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Ground extends Linkable {

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "Lclient!gd;")
	public TileOverlay aClass27_1;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!kf;")
	public GroundDecor aClass40_1;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "Z")
	public boolean aBoolean280;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Z")
	public boolean aBoolean281;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "Lclient!wa;")
	public Ground aClass4_Sub24_1;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "Lclient!r;")
	public Decor aClass61_1;

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!ab;")
	public Wall aClass3_1;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lclient!me;")
	public GroundObject aClass49_1;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "Lclient!we;")
	public TileUnderlay aClass83_1;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "[Lclient!gb;")
	public final Location[] aClass26Array3 = new Location[5];

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public int anInt3096 = 0;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "[I")
	public final int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
	public final int anInt3098;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	public final int anInt3104;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
	public int anInt3089;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
	public final int anInt3097;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(III)V")
	public Ground(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3098 = arg1;
		this.anInt3104 = arg2;
		this.anInt3097 = this.anInt3089 = arg0;
	}
}
