import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class134 {

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
	public int anInt4230;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
	private int anInt4232;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
	public int method3705() {
		return this.anInt4230 & 0x3FFF;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
	public void method3706(@OriginalArg(0) int arg0) {
		this.anInt4232 = 0;
		this.anInt4230 = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
	public void method3708() {
		this.anInt4230 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIBI)Z")
	public boolean method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4232;
		if (this.anInt4230 == arg1 && this.anInt4232 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(96) int local96;
		if (this.anInt4232 == 0) {
			if (this.anInt4230 < arg1 && arg2 + this.anInt4230 >= arg1 || arg1 < this.anInt4230 && arg1 >= this.anInt4230 - arg2) {
				this.anInt4230 = arg1;
				return false;
			}
			local59 = true;
		} else {
			@Pc(102) int local102;
			if (this.anInt4232 > 0 && arg1 > this.anInt4230) {
				local96 = this.anInt4232 * this.anInt4232 / (arg2 * 2);
				local102 = this.anInt4230 + local96;
				if (local102 < arg1 && this.anInt4230 <= local102) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt4232 < 0 && this.anInt4230 > arg1) {
				local96 = this.anInt4232 * this.anInt4232 / (arg2 * 2);
				local102 = this.anInt4230 - local96;
				if (arg1 < local102 && this.anInt4230 >= local102) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (this.anInt4230 >= arg1) {
				this.anInt4232 -= arg2;
				if (arg0 != 0 && this.anInt4232 < -arg0) {
					this.anInt4232 = -arg0;
				}
			} else {
				this.anInt4232 += arg2;
				if (arg0 != 0 && this.anInt4232 > arg0) {
					this.anInt4232 = arg0;
				}
			}
			if (this.anInt4232 != local8) {
				local96 = this.anInt4232 * this.anInt4232 / (arg2 * 2);
				if (this.anInt4230 < arg1) {
					if (local96 + this.anInt4230 > arg1) {
						this.anInt4232 = local8;
					}
				} else if (this.anInt4230 > arg1 && this.anInt4230 - local96 < arg1) {
					this.anInt4232 = local8;
				}
			}
		} else if (this.anInt4232 <= 0) {
			this.anInt4232 += arg2;
			if (this.anInt4232 > 0) {
				this.anInt4232 = 0;
			}
		} else {
			this.anInt4232 -= arg2;
			if (this.anInt4232 < 0) {
				this.anInt4232 = 0;
			}
		}
		this.anInt4230 += local8 + this.anInt4232 >> 1;
		return local59;
	}
}
